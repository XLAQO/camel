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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform operations on Hazelcast distributed list.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HazelcastListEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Hazelcast List component.
     */
    public interface HazelcastListEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedHazelcastListEndpointConsumerBuilder advanced() {
            return (AdvancedHazelcastListEndpointConsumerBuilder) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointConsumerBuilder defaultOperation(
                org.apache.camel.component.hazelcast.HazelcastOperation defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointConsumerBuilder defaultOperation(
                String defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * Hazelcast configuration file.
         * 
         * This option can also be loaded from an existing file, by prefixing
         * with file: or classpath: followed by the location of the file.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastConfigUri the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointConsumerBuilder hazelcastConfigUri(
                String hazelcastConfigUri) {
            doSetProperty("hazelcastConfigUri", hazelcastConfigUri);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a:
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointConsumerBuilder hazelcastInstance(
                com.hazelcast.core.HazelcastInstance hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointConsumerBuilder hazelcastInstance(
                String hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstanceName the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointConsumerBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            doSetProperty("hazelcastInstanceName", hazelcastInstanceName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Hazelcast List component.
     */
    public interface AdvancedHazelcastListEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default HazelcastListEndpointConsumerBuilder basic() {
            return (HazelcastListEndpointConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastListEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastListEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastListEndpointConsumerBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastListEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastListEndpointConsumerBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastListEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Hazelcast List component.
     */
    public interface HazelcastListEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedHazelcastListEndpointProducerBuilder advanced() {
            return (AdvancedHazelcastListEndpointProducerBuilder) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointProducerBuilder defaultOperation(
                org.apache.camel.component.hazelcast.HazelcastOperation defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointProducerBuilder defaultOperation(
                String defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * Hazelcast configuration file.
         * 
         * This option can also be loaded from an existing file, by prefixing
         * with file: or classpath: followed by the location of the file.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastConfigUri the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointProducerBuilder hazelcastConfigUri(
                String hazelcastConfigUri) {
            doSetProperty("hazelcastConfigUri", hazelcastConfigUri);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a:
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointProducerBuilder hazelcastInstance(
                com.hazelcast.core.HazelcastInstance hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointProducerBuilder hazelcastInstance(
                String hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstanceName the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointProducerBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            doSetProperty("hazelcastInstanceName", hazelcastInstanceName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Hazelcast List component.
     */
    public interface AdvancedHazelcastListEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default HazelcastListEndpointProducerBuilder basic() {
            return (HazelcastListEndpointProducerBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastListEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastListEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Hazelcast List component.
     */
    public interface HazelcastListEndpointBuilder
            extends
                HazelcastListEndpointConsumerBuilder,
                HazelcastListEndpointProducerBuilder {
        default AdvancedHazelcastListEndpointBuilder advanced() {
            return (AdvancedHazelcastListEndpointBuilder) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointBuilder defaultOperation(
                org.apache.camel.component.hazelcast.HazelcastOperation defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointBuilder defaultOperation(
                String defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * Hazelcast configuration file.
         * 
         * This option can also be loaded from an existing file, by prefixing
         * with file: or classpath: followed by the location of the file.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastConfigUri the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointBuilder hazelcastConfigUri(
                String hazelcastConfigUri) {
            doSetProperty("hazelcastConfigUri", hazelcastConfigUri);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a:
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointBuilder hazelcastInstance(
                com.hazelcast.core.HazelcastInstance hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointBuilder hazelcastInstance(
                String hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param hazelcastInstanceName the value to set
         * @return the dsl builder
         */
        default HazelcastListEndpointBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            doSetProperty("hazelcastInstanceName", hazelcastInstanceName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Hazelcast List component.
     */
    public interface AdvancedHazelcastListEndpointBuilder
            extends
                AdvancedHazelcastListEndpointConsumerBuilder,
                AdvancedHazelcastListEndpointProducerBuilder {
        default HazelcastListEndpointBuilder basic() {
            return (HazelcastListEndpointBuilder) this;
        }
    }

    public interface HazelcastListBuilders {
        /**
         * Hazelcast List (camel-hazelcast)
         * Perform operations on Hazelcast distributed list.
         * 
         * Category: cache,clustering
         * Since: 2.7
         * Maven coordinates: org.apache.camel:camel-hazelcast
         * 
         * @return the dsl builder for the headers' name.
         */
        default HazelcastListHeaderNameBuilder hazelcastList() {
            return HazelcastListHeaderNameBuilder.INSTANCE;
        }
        /**
         * Hazelcast List (camel-hazelcast)
         * Perform operations on Hazelcast distributed list.
         * 
         * Category: cache,clustering
         * Since: 2.7
         * Maven coordinates: org.apache.camel:camel-hazelcast
         * 
         * Syntax: <code>hazelcast-list:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * The name of the cache
         * 
         * @param path cacheName
         * @return the dsl builder
         */
        default HazelcastListEndpointBuilder hazelcastList(String path) {
            return HazelcastListEndpointBuilderFactory.endpointBuilder("hazelcast-list", path);
        }
        /**
         * Hazelcast List (camel-hazelcast)
         * Perform operations on Hazelcast distributed list.
         * 
         * Category: cache,clustering
         * Since: 2.7
         * Maven coordinates: org.apache.camel:camel-hazelcast
         * 
         * Syntax: <code>hazelcast-list:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * The name of the cache
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path cacheName
         * @return the dsl builder
         */
        default HazelcastListEndpointBuilder hazelcastList(
                String componentName,
                String path) {
            return HazelcastListEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Hazelcast List component.
     */
    public static class HazelcastListHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final HazelcastListHeaderNameBuilder INSTANCE = new HazelcastListHeaderNameBuilder();

        /**
         * the object id to store / find your object inside the cache.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: common
         * 
         * @return the name of the header {@code HazelcastObjectId}.
         */
        public String hazelcastObjectId() {
            return "CamelHazelcastObjectId";
        }

        /**
         * The index of the object.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code HazelcastObjectIndex}.
         */
        public String hazelcastObjectIndex() {
            return "CamelHazelcastObjectIndex";
        }

        /**
         * The type of event - here added and removed.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code HazelcastListenerAction}.
         */
        public String hazelcastListenerAction() {
            return "CamelHazelcastListenerAction";
        }

        /**
         * The map consumer.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code HazelcastListenerType}.
         */
        public String hazelcastListenerType() {
            return "CamelHazelcastListenerType";
        }

        /**
         * The time of the event in millis.
         * 
         * The option is a: {@code Long} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code HazelcastListenerTime}.
         */
        public String hazelcastListenerTime() {
            return "CamelHazelcastListenerTime";
        }

        /**
         * The name of the cache - e.g. foo.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code HazelcastCacheName}.
         */
        public String hazelcastCacheName() {
            return "CamelHazelcastCacheName";
        }

        /**
         * The operation to perform.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code HazelcastOperationType}.
         */
        public String hazelcastOperationType() {
            return "CamelHazelcastOperationType";
        }
    }
    static HazelcastListEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class HazelcastListEndpointBuilderImpl extends AbstractEndpointBuilder implements HazelcastListEndpointBuilder, AdvancedHazelcastListEndpointBuilder {
            public HazelcastListEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new HazelcastListEndpointBuilderImpl(path);
    }
}