/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.smb;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.hierynomus.smbj.SmbConfig;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.infra.smb.services.SmbService;
import org.apache.camel.test.infra.smb.services.SmbServiceFactory;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmbComponentConnectionIT extends CamelTestSupport {
    private static final Logger LOG = LoggerFactory.getLogger(SmbComponentIT.class);

    @RegisterExtension
    public static SmbService service = SmbServiceFactory.createService();

    @EndpointInject("mock:result")
    protected MockEndpoint mockResultEndpoint;

    @Test
    public void testSmbRead() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMessageCount(100);

        mock.assertIsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            private void process(Exchange exchange) throws IOException {
                final byte[] data = exchange.getMessage().getBody(byte[].class);
                final String filePath = exchange.getMessage().getHeader(SmbConstants.SMB_FILE_PATH, String.class);
                final String uncPath = exchange.getMessage().getHeader(SmbConstants.SMB_UNC_PATH, String.class);
                LOG.debug("Read exchange {} ({}) with contents: {}", filePath, uncPath, new String(data));
            }

            public void configure() {
                SmbConfig config = SmbConfig.builder()
                        .withTimeout(120, TimeUnit.SECONDS) // Timeout sets Read, Write, and Transact timeouts (default is 60 seconds)
                        .withSoTimeout(180, TimeUnit.SECONDS) // Socket Timeout (default is 0 seconds, blocks forever)
                        .build();
                context.getRegistry().bind("smbConfig", config);

                fromF("smb:%s/%s?username=%s&password=%s&path=/&smbConfig=#smbConfig", service.address(), service.shareName(),
                        service.userName(), service.password())
                        .to("seda:intermediate");

                from("seda:intermediate?concurrentConsumers=4")
                        .process(this::process)
                        .to("mock:result");
            }
        };
    }
}
