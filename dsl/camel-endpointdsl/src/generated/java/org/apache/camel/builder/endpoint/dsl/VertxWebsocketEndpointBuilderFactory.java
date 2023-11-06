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
 * Expose WebSocket endpoints and connect to remote WebSocket servers using
 * Vert.x
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface VertxWebsocketEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Vert.x WebSocket component.
     */
    public interface VertxWebsocketEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedVertxWebsocketEndpointConsumerBuilder advanced() {
            return (AdvancedVertxWebsocketEndpointConsumerBuilder) this;
        }
        /**
         * Regex pattern to match the origin header sent by WebSocket clients.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param allowedOriginPattern the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder allowedOriginPattern(
                String allowedOriginPattern) {
            doSetProperty("allowedOriginPattern", allowedOriginPattern);
            return this;
        }
        /**
         * When set to true, the consumer acts as a WebSocket client, creating
         * exchanges on each received WebSocket event.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param consumeAsClient the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder consumeAsClient(
                boolean consumeAsClient) {
            doSetProperty("consumeAsClient", consumeAsClient);
            return this;
        }
        /**
         * When set to true, the consumer acts as a WebSocket client, creating
         * exchanges on each received WebSocket event.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param consumeAsClient the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder consumeAsClient(
                String consumeAsClient) {
            doSetProperty("consumeAsClient", consumeAsClient);
            return this;
        }
        /**
         * Whether the server consumer will create a message exchange when a new
         * WebSocket peer connects or disconnects.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param fireWebSocketConnectionEvents the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder fireWebSocketConnectionEvents(
                boolean fireWebSocketConnectionEvents) {
            doSetProperty("fireWebSocketConnectionEvents", fireWebSocketConnectionEvents);
            return this;
        }
        /**
         * Whether the server consumer will create a message exchange when a new
         * WebSocket peer connects or disconnects.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param fireWebSocketConnectionEvents the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder fireWebSocketConnectionEvents(
                String fireWebSocketConnectionEvents) {
            doSetProperty("fireWebSocketConnectionEvents", fireWebSocketConnectionEvents);
            return this;
        }
        /**
         * When consumeAsClient is set to true this sets the maximum number of
         * allowed reconnection attempts to a previously closed WebSocket. A
         * value of 0 (the default) will attempt to reconnect indefinitely.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: consumer
         * 
         * @param maxReconnectAttempts the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder maxReconnectAttempts(
                int maxReconnectAttempts) {
            doSetProperty("maxReconnectAttempts", maxReconnectAttempts);
            return this;
        }
        /**
         * When consumeAsClient is set to true this sets the maximum number of
         * allowed reconnection attempts to a previously closed WebSocket. A
         * value of 0 (the default) will attempt to reconnect indefinitely.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: consumer
         * 
         * @param maxReconnectAttempts the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder maxReconnectAttempts(
                String maxReconnectAttempts) {
            doSetProperty("maxReconnectAttempts", maxReconnectAttempts);
            return this;
        }
        /**
         * When consumeAsClient is set to true this sets the initial delay in
         * milliseconds before attempting to reconnect to a previously closed
         * WebSocket.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: consumer
         * 
         * @param reconnectInitialDelay the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder reconnectInitialDelay(
                int reconnectInitialDelay) {
            doSetProperty("reconnectInitialDelay", reconnectInitialDelay);
            return this;
        }
        /**
         * When consumeAsClient is set to true this sets the initial delay in
         * milliseconds before attempting to reconnect to a previously closed
         * WebSocket.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: consumer
         * 
         * @param reconnectInitialDelay the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder reconnectInitialDelay(
                String reconnectInitialDelay) {
            doSetProperty("reconnectInitialDelay", reconnectInitialDelay);
            return this;
        }
        /**
         * When consumeAsClient is set to true this sets the interval in
         * milliseconds at which reconnecting to a previously closed WebSocket
         * occurs.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: consumer
         * 
         * @param reconnectInterval the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder reconnectInterval(
                int reconnectInterval) {
            doSetProperty("reconnectInterval", reconnectInterval);
            return this;
        }
        /**
         * When consumeAsClient is set to true this sets the interval in
         * milliseconds at which reconnecting to a previously closed WebSocket
         * occurs.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: consumer
         * 
         * @param reconnectInterval the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder reconnectInterval(
                String reconnectInterval) {
            doSetProperty("reconnectInterval", reconnectInterval);
            return this;
        }
        /**
         * To use an existing vertx router for the HTTP server.
         * 
         * The option is a: &lt;code&gt;io.vertx.ext.web.Router&lt;/code&gt;
         * type.
         * 
         * Group: consumer
         * 
         * @param router the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder router(
                io.vertx.ext.web.Router router) {
            doSetProperty("router", router);
            return this;
        }
        /**
         * To use an existing vertx router for the HTTP server.
         * 
         * The option will be converted to a
         * &lt;code&gt;io.vertx.ext.web.Router&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param router the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder router(String router) {
            doSetProperty("router", router);
            return this;
        }
        /**
         * Sets customized options for configuring the HTTP server hosting the
         * WebSocket for the consumer.
         * 
         * The option is a:
         * &lt;code&gt;io.vertx.core.http.HttpServerOptions&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param serverOptions the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder serverOptions(
                io.vertx.core.http.HttpServerOptions serverOptions) {
            doSetProperty("serverOptions", serverOptions);
            return this;
        }
        /**
         * Sets customized options for configuring the HTTP server hosting the
         * WebSocket for the consumer.
         * 
         * The option will be converted to a
         * &lt;code&gt;io.vertx.core.http.HttpServerOptions&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param serverOptions the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder serverOptions(
                String serverOptions) {
            doSetProperty("serverOptions", serverOptions);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointConsumerBuilder sslContextParameters(
                String sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Vert.x WebSocket
     * component.
     */
    public interface AdvancedVertxWebsocketEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default VertxWebsocketEndpointConsumerBuilder basic() {
            return (VertxWebsocketEndpointConsumerBuilder) this;
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
        default AdvancedVertxWebsocketEndpointConsumerBuilder bridgeErrorHandler(
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
        default AdvancedVertxWebsocketEndpointConsumerBuilder bridgeErrorHandler(
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
        default AdvancedVertxWebsocketEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedVertxWebsocketEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedVertxWebsocketEndpointConsumerBuilder exchangePattern(
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
        default AdvancedVertxWebsocketEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Vert.x WebSocket component.
     */
    public interface VertxWebsocketEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedVertxWebsocketEndpointProducerBuilder advanced() {
            return (AdvancedVertxWebsocketEndpointProducerBuilder) this;
        }
        /**
         * Whether the WebSocket client should add the Origin header to the
         * WebSocket handshake request.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param allowOriginHeader the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointProducerBuilder allowOriginHeader(
                boolean allowOriginHeader) {
            doSetProperty("allowOriginHeader", allowOriginHeader);
            return this;
        }
        /**
         * Whether the WebSocket client should add the Origin header to the
         * WebSocket handshake request.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param allowOriginHeader the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointProducerBuilder allowOriginHeader(
                String allowOriginHeader) {
            doSetProperty("allowOriginHeader", allowOriginHeader);
            return this;
        }
        /**
         * The value of the Origin header that the WebSocket client should use
         * on the WebSocket handshake request. When not specified, the WebSocket
         * client will automatically determine the value for the Origin from the
         * request URL.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param originHeaderUrl the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointProducerBuilder originHeaderUrl(
                String originHeaderUrl) {
            doSetProperty("originHeaderUrl", originHeaderUrl);
            return this;
        }
        /**
         * Sets customized options for configuring the WebSocket client used in
         * the producer.
         * 
         * The option is a:
         * &lt;code&gt;io.vertx.core.http.HttpClientOptions&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param clientOptions the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointProducerBuilder clientOptions(
                io.vertx.core.http.HttpClientOptions clientOptions) {
            doSetProperty("clientOptions", clientOptions);
            return this;
        }
        /**
         * Sets customized options for configuring the WebSocket client used in
         * the producer.
         * 
         * The option will be converted to a
         * &lt;code&gt;io.vertx.core.http.HttpClientOptions&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param clientOptions the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointProducerBuilder clientOptions(
                String clientOptions) {
            doSetProperty("clientOptions", clientOptions);
            return this;
        }
        /**
         * Comma separated list of WebSocket subprotocols that the client should
         * use for the Sec-WebSocket-Protocol header.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param clientSubProtocols the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointProducerBuilder clientSubProtocols(
                String clientSubProtocols) {
            doSetProperty("clientSubProtocols", clientSubProtocols);
            return this;
        }
        /**
         * To send to all websocket subscribers. Can be used to configure at the
         * endpoint level, instead of providing the
         * VertxWebsocketConstants.SEND_TO_ALL header on the message. Note that
         * when using this option, the host name specified for the
         * vertx-websocket producer URI must match one used for an existing
         * vertx-websocket consumer. Note that this option only applies when
         * producing messages to endpoints hosted by the vertx-websocket
         * consumer and not to an externally hosted WebSocket.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param sendToAll the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointProducerBuilder sendToAll(
                boolean sendToAll) {
            doSetProperty("sendToAll", sendToAll);
            return this;
        }
        /**
         * To send to all websocket subscribers. Can be used to configure at the
         * endpoint level, instead of providing the
         * VertxWebsocketConstants.SEND_TO_ALL header on the message. Note that
         * when using this option, the host name specified for the
         * vertx-websocket producer URI must match one used for an existing
         * vertx-websocket consumer. Note that this option only applies when
         * producing messages to endpoints hosted by the vertx-websocket
         * consumer and not to an externally hosted WebSocket.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param sendToAll the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointProducerBuilder sendToAll(String sendToAll) {
            doSetProperty("sendToAll", sendToAll);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointProducerBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointProducerBuilder sslContextParameters(
                String sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Vert.x WebSocket
     * component.
     */
    public interface AdvancedVertxWebsocketEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default VertxWebsocketEndpointProducerBuilder basic() {
            return (VertxWebsocketEndpointProducerBuilder) this;
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
        default AdvancedVertxWebsocketEndpointProducerBuilder lazyStartProducer(
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
        default AdvancedVertxWebsocketEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Vert.x WebSocket component.
     */
    public interface VertxWebsocketEndpointBuilder
            extends
                VertxWebsocketEndpointConsumerBuilder,
                VertxWebsocketEndpointProducerBuilder {
        default AdvancedVertxWebsocketEndpointBuilder advanced() {
            return (AdvancedVertxWebsocketEndpointBuilder) this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default VertxWebsocketEndpointBuilder sslContextParameters(
                String sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Vert.x WebSocket component.
     */
    public interface AdvancedVertxWebsocketEndpointBuilder
            extends
                AdvancedVertxWebsocketEndpointConsumerBuilder,
                AdvancedVertxWebsocketEndpointProducerBuilder {
        default VertxWebsocketEndpointBuilder basic() {
            return (VertxWebsocketEndpointBuilder) this;
        }
    }

    public interface VertxWebsocketBuilders {
        /**
         * Vert.x WebSocket (camel-vertx-websocket)
         * Expose WebSocket endpoints and connect to remote WebSocket servers
         * using Vert.x
         * 
         * Category: http,networking
         * Since: 3.5
         * Maven coordinates: org.apache.camel:camel-vertx-websocket
         * 
         * @return the dsl builder for the headers' name.
         */
        default VertxWebsocketHeaderNameBuilder vertxWebsocket() {
            return VertxWebsocketHeaderNameBuilder.INSTANCE;
        }
        /**
         * Vert.x WebSocket (camel-vertx-websocket)
         * Expose WebSocket endpoints and connect to remote WebSocket servers
         * using Vert.x
         * 
         * Category: http,networking
         * Since: 3.5
         * Maven coordinates: org.apache.camel:camel-vertx-websocket
         * 
         * Syntax: <code>vertx-websocket:host:port/path</code>
         * 
         * Path parameter: host (required)
         * WebSocket hostname, such as localhost or a remote host when in client
         * mode.
         * 
         * Path parameter: port (required)
         * WebSocket port number to use.
         * 
         * Path parameter: path
         * WebSocket path to use.
         * 
         * @param path host:port/path
         * @return the dsl builder
         */
        default VertxWebsocketEndpointBuilder vertxWebsocket(String path) {
            return VertxWebsocketEndpointBuilderFactory.endpointBuilder("vertx-websocket", path);
        }
        /**
         * Vert.x WebSocket (camel-vertx-websocket)
         * Expose WebSocket endpoints and connect to remote WebSocket servers
         * using Vert.x
         * 
         * Category: http,networking
         * Since: 3.5
         * Maven coordinates: org.apache.camel:camel-vertx-websocket
         * 
         * Syntax: <code>vertx-websocket:host:port/path</code>
         * 
         * Path parameter: host (required)
         * WebSocket hostname, such as localhost or a remote host when in client
         * mode.
         * 
         * Path parameter: port (required)
         * WebSocket port number to use.
         * 
         * Path parameter: path
         * WebSocket path to use.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host:port/path
         * @return the dsl builder
         */
        default VertxWebsocketEndpointBuilder vertxWebsocket(
                String componentName,
                String path) {
            return VertxWebsocketEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Vert.x WebSocket component.
     */
    public static class VertxWebsocketHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final VertxWebsocketHeaderNameBuilder INSTANCE = new VertxWebsocketHeaderNameBuilder();

        /**
         * Sends the message to the client with the given connection key. You
         * can use a comma separated list of keys to send a message to multiple
         * clients. Note that this option only applies when producing messages
         * to endpoints hosted by the vertx-websocket consumer and not to an
         * externally hosted WebSocket.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: common
         * 
         * @return the name of the header {@code VertxWebsocket.connectionKey}.
         */
        public String vertxwebsocketConnectionkey() {
            return "CamelVertxWebsocket.connectionKey";
        }

        /**
         * Sends the message to all clients which are currently connected. You
         * can use the sendToAll option on the endpoint instead of using this
         * header. Note that this option only applies when producing messages to
         * endpoints hosted by the vertx-websocket consumer and not to an
         * externally hosted WebSocket.
         * 
         * The option is a: {@code boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code VertxWebsocket.sendToAll}.
         */
        public String vertxwebsocketSendtoall() {
            return "CamelVertxWebsocket.sendToAll";
        }

        /**
         * The remote address.
         * 
         * The option is a: {@code io.vertx.core.net.SocketAddress} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code VertxWebsocket.remoteAddress}.
         */
        public String vertxwebsocketRemoteaddress() {
            return "CamelVertxWebsocket.remoteAddress";
        }

        /**
         * The WebSocket event that triggered the message exchange.
         * 
         * The option is a: {@code
         * org.apache.camel.component.vertx.websocket.VertxWebsocketEvent} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code VertxWebsocket.event}.
         */
        public String vertxwebsocketEvent() {
            return "CamelVertxWebsocket.event";
        }
    }
    static VertxWebsocketEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class VertxWebsocketEndpointBuilderImpl extends AbstractEndpointBuilder implements VertxWebsocketEndpointBuilder, AdvancedVertxWebsocketEndpointBuilder {
            public VertxWebsocketEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new VertxWebsocketEndpointBuilderImpl(path);
    }
}