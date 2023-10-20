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
 * Send and receive events from Knative.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface KnativeEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Knative component.
     */
    public interface KnativeEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedKnativeEndpointConsumerBuilder advanced() {
            return (AdvancedKnativeEndpointConsumerBuilder) this;
        }
        /**
         * CloudEvent headers to override.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param ceOverride the value to set
         * @return the dsl builder
         */
        default KnativeEndpointConsumerBuilder ceOverride(
                Map<java.lang.String, java.lang.String> ceOverride) {
            doSetProperty("ceOverride", ceOverride);
            return this;
        }
        /**
         * CloudEvent headers to override.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param ceOverride the value to set
         * @return the dsl builder
         */
        default KnativeEndpointConsumerBuilder ceOverride(String ceOverride) {
            doSetProperty("ceOverride", ceOverride);
            return this;
        }
        /**
         * Set the version of the cloudevents spec.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: 1.0
         * Group: common
         * 
         * @param cloudEventsSpecVersion the value to set
         * @return the dsl builder
         */
        default KnativeEndpointConsumerBuilder cloudEventsSpecVersion(
                String cloudEventsSpecVersion) {
            doSetProperty("cloudEventsSpecVersion", cloudEventsSpecVersion);
            return this;
        }
        /**
         * Set the event-type information of the produced events.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: org.apache.camel.event
         * Group: common
         * 
         * @param cloudEventsType the value to set
         * @return the dsl builder
         */
        default KnativeEndpointConsumerBuilder cloudEventsType(
                String cloudEventsType) {
            doSetProperty("cloudEventsType", cloudEventsType);
            return this;
        }
        /**
         * The environment.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.knative.spi.KnativeEnvironment&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param environment the value to set
         * @return the dsl builder
         */
        default KnativeEndpointConsumerBuilder environment(
                org.apache.camel.component.knative.spi.KnativeEnvironment environment) {
            doSetProperty("environment", environment);
            return this;
        }
        /**
         * The environment.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.knative.spi.KnativeEnvironment&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param environment the value to set
         * @return the dsl builder
         */
        default KnativeEndpointConsumerBuilder environment(String environment) {
            doSetProperty("environment", environment);
            return this;
        }
        /**
         * Set the filters.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param filters the value to set
         * @return the dsl builder
         */
        default KnativeEndpointConsumerBuilder filters(
                Map<java.lang.String, java.lang.String> filters) {
            doSetProperty("filters", filters);
            return this;
        }
        /**
         * Set the filters.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param filters the value to set
         * @return the dsl builder
         */
        default KnativeEndpointConsumerBuilder filters(String filters) {
            doSetProperty("filters", filters);
            return this;
        }
        /**
         * Set the transport options.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param transportOptions the value to set
         * @return the dsl builder
         */
        default KnativeEndpointConsumerBuilder transportOptions(
                Map<java.lang.String, java.lang.Object> transportOptions) {
            doSetProperty("transportOptions", transportOptions);
            return this;
        }
        /**
         * Set the transport options.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param transportOptions the value to set
         * @return the dsl builder
         */
        default KnativeEndpointConsumerBuilder transportOptions(
                String transportOptions) {
            doSetProperty("transportOptions", transportOptions);
            return this;
        }
        /**
         * Transforms the reply into a cloud event that will be processed by the
         * caller. When listening to events from a Knative Broker, if this flag
         * is enabled, replies will be published to the same Broker where the
         * request comes from (beware that if you don't change the type of the
         * received message, you may create a loop and receive your same reply).
         * When this flag is disabled, CloudEvent headers are removed from the
         * reply.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param replyWithCloudEvent the value to set
         * @return the dsl builder
         */
        default KnativeEndpointConsumerBuilder replyWithCloudEvent(
                boolean replyWithCloudEvent) {
            doSetProperty("replyWithCloudEvent", replyWithCloudEvent);
            return this;
        }
        /**
         * Transforms the reply into a cloud event that will be processed by the
         * caller. When listening to events from a Knative Broker, if this flag
         * is enabled, replies will be published to the same Broker where the
         * request comes from (beware that if you don't change the type of the
         * received message, you may create a loop and receive your same reply).
         * When this flag is disabled, CloudEvent headers are removed from the
         * reply.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param replyWithCloudEvent the value to set
         * @return the dsl builder
         */
        default KnativeEndpointConsumerBuilder replyWithCloudEvent(
                String replyWithCloudEvent) {
            doSetProperty("replyWithCloudEvent", replyWithCloudEvent);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Knative component.
     */
    public interface AdvancedKnativeEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default KnativeEndpointConsumerBuilder basic() {
            return (KnativeEndpointConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedKnativeEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
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
        default AdvancedKnativeEndpointConsumerBuilder bridgeErrorHandler(
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
        default AdvancedKnativeEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedKnativeEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedKnativeEndpointConsumerBuilder exchangePattern(
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
        default AdvancedKnativeEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * If the consumer should construct a full reply to knative request.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer (advanced)
         * 
         * @param reply the value to set
         * @return the dsl builder
         */
        default AdvancedKnativeEndpointConsumerBuilder reply(Boolean reply) {
            doSetProperty("reply", reply);
            return this;
        }
        /**
         * If the consumer should construct a full reply to knative request.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer (advanced)
         * 
         * @param reply the value to set
         * @return the dsl builder
         */
        default AdvancedKnativeEndpointConsumerBuilder reply(String reply) {
            doSetProperty("reply", reply);
            return this;
        }
        /**
         * The version of the k8s resource referenced by the endpoint.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param apiVersion the value to set
         * @return the dsl builder
         */
        default AdvancedKnativeEndpointConsumerBuilder apiVersion(
                String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The type of the k8s resource referenced by the endpoint.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param kind the value to set
         * @return the dsl builder
         */
        default AdvancedKnativeEndpointConsumerBuilder kind(String kind) {
            doSetProperty("kind", kind);
            return this;
        }
        /**
         * The name of the k8s resource referenced by the endpoint.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param name the value to set
         * @return the dsl builder
         */
        default AdvancedKnativeEndpointConsumerBuilder name(String name) {
            doSetProperty("name", name);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Knative component.
     */
    public interface KnativeEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedKnativeEndpointProducerBuilder advanced() {
            return (AdvancedKnativeEndpointProducerBuilder) this;
        }
        /**
         * CloudEvent headers to override.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param ceOverride the value to set
         * @return the dsl builder
         */
        default KnativeEndpointProducerBuilder ceOverride(
                Map<java.lang.String, java.lang.String> ceOverride) {
            doSetProperty("ceOverride", ceOverride);
            return this;
        }
        /**
         * CloudEvent headers to override.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param ceOverride the value to set
         * @return the dsl builder
         */
        default KnativeEndpointProducerBuilder ceOverride(String ceOverride) {
            doSetProperty("ceOverride", ceOverride);
            return this;
        }
        /**
         * Set the version of the cloudevents spec.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: 1.0
         * Group: common
         * 
         * @param cloudEventsSpecVersion the value to set
         * @return the dsl builder
         */
        default KnativeEndpointProducerBuilder cloudEventsSpecVersion(
                String cloudEventsSpecVersion) {
            doSetProperty("cloudEventsSpecVersion", cloudEventsSpecVersion);
            return this;
        }
        /**
         * Set the event-type information of the produced events.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: org.apache.camel.event
         * Group: common
         * 
         * @param cloudEventsType the value to set
         * @return the dsl builder
         */
        default KnativeEndpointProducerBuilder cloudEventsType(
                String cloudEventsType) {
            doSetProperty("cloudEventsType", cloudEventsType);
            return this;
        }
        /**
         * The environment.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.knative.spi.KnativeEnvironment&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param environment the value to set
         * @return the dsl builder
         */
        default KnativeEndpointProducerBuilder environment(
                org.apache.camel.component.knative.spi.KnativeEnvironment environment) {
            doSetProperty("environment", environment);
            return this;
        }
        /**
         * The environment.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.knative.spi.KnativeEnvironment&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param environment the value to set
         * @return the dsl builder
         */
        default KnativeEndpointProducerBuilder environment(String environment) {
            doSetProperty("environment", environment);
            return this;
        }
        /**
         * Set the filters.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param filters the value to set
         * @return the dsl builder
         */
        default KnativeEndpointProducerBuilder filters(
                Map<java.lang.String, java.lang.String> filters) {
            doSetProperty("filters", filters);
            return this;
        }
        /**
         * Set the filters.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param filters the value to set
         * @return the dsl builder
         */
        default KnativeEndpointProducerBuilder filters(String filters) {
            doSetProperty("filters", filters);
            return this;
        }
        /**
         * Set the transport options.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param transportOptions the value to set
         * @return the dsl builder
         */
        default KnativeEndpointProducerBuilder transportOptions(
                Map<java.lang.String, java.lang.Object> transportOptions) {
            doSetProperty("transportOptions", transportOptions);
            return this;
        }
        /**
         * Set the transport options.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param transportOptions the value to set
         * @return the dsl builder
         */
        default KnativeEndpointProducerBuilder transportOptions(
                String transportOptions) {
            doSetProperty("transportOptions", transportOptions);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Knative component.
     */
    public interface AdvancedKnativeEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default KnativeEndpointProducerBuilder basic() {
            return (KnativeEndpointProducerBuilder) this;
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
        default AdvancedKnativeEndpointProducerBuilder lazyStartProducer(
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
        default AdvancedKnativeEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The version of the k8s resource referenced by the endpoint.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param apiVersion the value to set
         * @return the dsl builder
         */
        default AdvancedKnativeEndpointProducerBuilder apiVersion(
                String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The type of the k8s resource referenced by the endpoint.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param kind the value to set
         * @return the dsl builder
         */
        default AdvancedKnativeEndpointProducerBuilder kind(String kind) {
            doSetProperty("kind", kind);
            return this;
        }
        /**
         * The name of the k8s resource referenced by the endpoint.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param name the value to set
         * @return the dsl builder
         */
        default AdvancedKnativeEndpointProducerBuilder name(String name) {
            doSetProperty("name", name);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Knative component.
     */
    public interface KnativeEndpointBuilder
            extends
                KnativeEndpointConsumerBuilder,
                KnativeEndpointProducerBuilder {
        default AdvancedKnativeEndpointBuilder advanced() {
            return (AdvancedKnativeEndpointBuilder) this;
        }
        /**
         * CloudEvent headers to override.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param ceOverride the value to set
         * @return the dsl builder
         */
        default KnativeEndpointBuilder ceOverride(
                Map<java.lang.String, java.lang.String> ceOverride) {
            doSetProperty("ceOverride", ceOverride);
            return this;
        }
        /**
         * CloudEvent headers to override.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param ceOverride the value to set
         * @return the dsl builder
         */
        default KnativeEndpointBuilder ceOverride(String ceOverride) {
            doSetProperty("ceOverride", ceOverride);
            return this;
        }
        /**
         * Set the version of the cloudevents spec.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: 1.0
         * Group: common
         * 
         * @param cloudEventsSpecVersion the value to set
         * @return the dsl builder
         */
        default KnativeEndpointBuilder cloudEventsSpecVersion(
                String cloudEventsSpecVersion) {
            doSetProperty("cloudEventsSpecVersion", cloudEventsSpecVersion);
            return this;
        }
        /**
         * Set the event-type information of the produced events.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: org.apache.camel.event
         * Group: common
         * 
         * @param cloudEventsType the value to set
         * @return the dsl builder
         */
        default KnativeEndpointBuilder cloudEventsType(String cloudEventsType) {
            doSetProperty("cloudEventsType", cloudEventsType);
            return this;
        }
        /**
         * The environment.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.knative.spi.KnativeEnvironment&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param environment the value to set
         * @return the dsl builder
         */
        default KnativeEndpointBuilder environment(
                org.apache.camel.component.knative.spi.KnativeEnvironment environment) {
            doSetProperty("environment", environment);
            return this;
        }
        /**
         * The environment.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.knative.spi.KnativeEnvironment&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param environment the value to set
         * @return the dsl builder
         */
        default KnativeEndpointBuilder environment(String environment) {
            doSetProperty("environment", environment);
            return this;
        }
        /**
         * Set the filters.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param filters the value to set
         * @return the dsl builder
         */
        default KnativeEndpointBuilder filters(
                Map<java.lang.String, java.lang.String> filters) {
            doSetProperty("filters", filters);
            return this;
        }
        /**
         * Set the filters.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param filters the value to set
         * @return the dsl builder
         */
        default KnativeEndpointBuilder filters(String filters) {
            doSetProperty("filters", filters);
            return this;
        }
        /**
         * Set the transport options.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param transportOptions the value to set
         * @return the dsl builder
         */
        default KnativeEndpointBuilder transportOptions(
                Map<java.lang.String, java.lang.Object> transportOptions) {
            doSetProperty("transportOptions", transportOptions);
            return this;
        }
        /**
         * Set the transport options.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param transportOptions the value to set
         * @return the dsl builder
         */
        default KnativeEndpointBuilder transportOptions(String transportOptions) {
            doSetProperty("transportOptions", transportOptions);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Knative component.
     */
    public interface AdvancedKnativeEndpointBuilder
            extends
                AdvancedKnativeEndpointConsumerBuilder,
                AdvancedKnativeEndpointProducerBuilder {
        default KnativeEndpointBuilder basic() {
            return (KnativeEndpointBuilder) this;
        }
        /**
         * The version of the k8s resource referenced by the endpoint.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param apiVersion the value to set
         * @return the dsl builder
         */
        default AdvancedKnativeEndpointBuilder apiVersion(String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The type of the k8s resource referenced by the endpoint.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param kind the value to set
         * @return the dsl builder
         */
        default AdvancedKnativeEndpointBuilder kind(String kind) {
            doSetProperty("kind", kind);
            return this;
        }
        /**
         * The name of the k8s resource referenced by the endpoint.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param name the value to set
         * @return the dsl builder
         */
        default AdvancedKnativeEndpointBuilder name(String name) {
            doSetProperty("name", name);
            return this;
        }
    }

    public interface KnativeBuilders {
        /**
         * Knative (camel-knative)
         * Send and receive events from Knative.
         * 
         * Category: cloud
         * Since: 3.15
         * Maven coordinates: org.apache.camel:camel-knative
         * 
         * Syntax: <code>knative:type/typeId</code>
         * 
         * Path parameter: type
         * The Knative resource type
         * There are 3 enums and the value can be one of: endpoint, channel,
         * event
         * 
         * Path parameter: typeId
         * The identifier of the Knative resource
         * 
         * @param path type/typeId
         * @return the dsl builder
         */
        default KnativeEndpointBuilder knative(String path) {
            return KnativeEndpointBuilderFactory.endpointBuilder("knative", path);
        }
        /**
         * Knative (camel-knative)
         * Send and receive events from Knative.
         * 
         * Category: cloud
         * Since: 3.15
         * Maven coordinates: org.apache.camel:camel-knative
         * 
         * Syntax: <code>knative:type/typeId</code>
         * 
         * Path parameter: type
         * The Knative resource type
         * There are 3 enums and the value can be one of: endpoint, channel,
         * event
         * 
         * Path parameter: typeId
         * The identifier of the Knative resource
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path type/typeId
         * @return the dsl builder
         */
        default KnativeEndpointBuilder knative(String componentName, String path) {
            return KnativeEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static KnativeEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class KnativeEndpointBuilderImpl extends AbstractEndpointBuilder implements KnativeEndpointBuilder, AdvancedKnativeEndpointBuilder {
            public KnativeEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new KnativeEndpointBuilderImpl(path);
    }
}