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
import java.util.Map;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Manage posts and users using Wordpress API.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface WordpressEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Wordpress component.
     */
    public interface WordpressEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedWordpressEndpointConsumerBuilder advanced() {
            return (AdvancedWordpressEndpointConsumerBuilder) this;
        }
        /**
         * The Wordpress REST API version.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: 2
         * Group: common
         * 
         * @param apiVersion the value to set
         * @return the dsl builder
         */
        default WordpressEndpointConsumerBuilder apiVersion(String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the criteria(String,
         * Object) method to add a value (call the method multiple times to set
         * more values).
         * 
         * Group: common
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default WordpressEndpointConsumerBuilder criteria(
                String key,
                Object value) {
            doSetMultiValueProperty("criteria", "criteria." + key, value);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the criteria(String,
         * Object) method to add a value (call the method multiple times to set
         * more values).
         * 
         * Group: common
         * 
         * @param values the values
         * @return the dsl builder
         */
        default WordpressEndpointConsumerBuilder criteria(Map values) {
            doSetMultiValueProperties("criteria", "criteria.", values);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param force the value to set
         * @return the dsl builder
         */
        default WordpressEndpointConsumerBuilder force(boolean force) {
            doSetProperty("force", force);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param force the value to set
         * @return the dsl builder
         */
        default WordpressEndpointConsumerBuilder force(String force) {
            doSetProperty("force", force);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param id the value to set
         * @return the dsl builder
         */
        default WordpressEndpointConsumerBuilder id(Integer id) {
            doSetProperty("id", id);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param id the value to set
         * @return the dsl builder
         */
        default WordpressEndpointConsumerBuilder id(String id) {
            doSetProperty("id", id);
            return this;
        }
        /**
         * Password from authorized user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default WordpressEndpointConsumerBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Search criteria.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.wordpress.api.model.SearchCriteria&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param searchCriteria the value to set
         * @return the dsl builder
         */
        default WordpressEndpointConsumerBuilder searchCriteria(
                org.apache.camel.component.wordpress.api.model.SearchCriteria searchCriteria) {
            doSetProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * Search criteria.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.wordpress.api.model.SearchCriteria&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param searchCriteria the value to set
         * @return the dsl builder
         */
        default WordpressEndpointConsumerBuilder searchCriteria(
                String searchCriteria) {
            doSetProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * The Wordpress API URL from your site, e.g.
         * http://myblog.com/wp-json/.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param url the value to set
         * @return the dsl builder
         */
        default WordpressEndpointConsumerBuilder url(String url) {
            doSetProperty("url", url);
            return this;
        }
        /**
         * Authorized user to perform writing operations.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param user the value to set
         * @return the dsl builder
         */
        default WordpressEndpointConsumerBuilder user(String user) {
            doSetProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Wordpress component.
     */
    public interface AdvancedWordpressEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default WordpressEndpointConsumerBuilder basic() {
            return (WordpressEndpointConsumerBuilder) this;
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
        default AdvancedWordpressEndpointConsumerBuilder bridgeErrorHandler(
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
        default AdvancedWordpressEndpointConsumerBuilder bridgeErrorHandler(
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
        default AdvancedWordpressEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedWordpressEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedWordpressEndpointConsumerBuilder exchangePattern(
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
        default AdvancedWordpressEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Wordpress component.
     */
    public interface WordpressEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedWordpressEndpointProducerBuilder advanced() {
            return (AdvancedWordpressEndpointProducerBuilder) this;
        }
        /**
         * The Wordpress REST API version.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: 2
         * Group: common
         * 
         * @param apiVersion the value to set
         * @return the dsl builder
         */
        default WordpressEndpointProducerBuilder apiVersion(String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the criteria(String,
         * Object) method to add a value (call the method multiple times to set
         * more values).
         * 
         * Group: common
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default WordpressEndpointProducerBuilder criteria(
                String key,
                Object value) {
            doSetMultiValueProperty("criteria", "criteria." + key, value);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the criteria(String,
         * Object) method to add a value (call the method multiple times to set
         * more values).
         * 
         * Group: common
         * 
         * @param values the values
         * @return the dsl builder
         */
        default WordpressEndpointProducerBuilder criteria(Map values) {
            doSetMultiValueProperties("criteria", "criteria.", values);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param force the value to set
         * @return the dsl builder
         */
        default WordpressEndpointProducerBuilder force(boolean force) {
            doSetProperty("force", force);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param force the value to set
         * @return the dsl builder
         */
        default WordpressEndpointProducerBuilder force(String force) {
            doSetProperty("force", force);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param id the value to set
         * @return the dsl builder
         */
        default WordpressEndpointProducerBuilder id(Integer id) {
            doSetProperty("id", id);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param id the value to set
         * @return the dsl builder
         */
        default WordpressEndpointProducerBuilder id(String id) {
            doSetProperty("id", id);
            return this;
        }
        /**
         * Password from authorized user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default WordpressEndpointProducerBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Search criteria.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.wordpress.api.model.SearchCriteria&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param searchCriteria the value to set
         * @return the dsl builder
         */
        default WordpressEndpointProducerBuilder searchCriteria(
                org.apache.camel.component.wordpress.api.model.SearchCriteria searchCriteria) {
            doSetProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * Search criteria.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.wordpress.api.model.SearchCriteria&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param searchCriteria the value to set
         * @return the dsl builder
         */
        default WordpressEndpointProducerBuilder searchCriteria(
                String searchCriteria) {
            doSetProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * The Wordpress API URL from your site, e.g.
         * http://myblog.com/wp-json/.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param url the value to set
         * @return the dsl builder
         */
        default WordpressEndpointProducerBuilder url(String url) {
            doSetProperty("url", url);
            return this;
        }
        /**
         * Authorized user to perform writing operations.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param user the value to set
         * @return the dsl builder
         */
        default WordpressEndpointProducerBuilder user(String user) {
            doSetProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Wordpress component.
     */
    public interface AdvancedWordpressEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default WordpressEndpointProducerBuilder basic() {
            return (WordpressEndpointProducerBuilder) this;
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
        default AdvancedWordpressEndpointProducerBuilder lazyStartProducer(
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
        default AdvancedWordpressEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Wordpress component.
     */
    public interface WordpressEndpointBuilder
            extends
                WordpressEndpointConsumerBuilder,
                WordpressEndpointProducerBuilder {
        default AdvancedWordpressEndpointBuilder advanced() {
            return (AdvancedWordpressEndpointBuilder) this;
        }
        /**
         * The Wordpress REST API version.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: 2
         * Group: common
         * 
         * @param apiVersion the value to set
         * @return the dsl builder
         */
        default WordpressEndpointBuilder apiVersion(String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the criteria(String,
         * Object) method to add a value (call the method multiple times to set
         * more values).
         * 
         * Group: common
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default WordpressEndpointBuilder criteria(String key, Object value) {
            doSetMultiValueProperty("criteria", "criteria." + key, value);
            return this;
        }
        /**
         * The criteria to use with complex searches.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the criteria(String,
         * Object) method to add a value (call the method multiple times to set
         * more values).
         * 
         * Group: common
         * 
         * @param values the values
         * @return the dsl builder
         */
        default WordpressEndpointBuilder criteria(Map values) {
            doSetMultiValueProperties("criteria", "criteria.", values);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param force the value to set
         * @return the dsl builder
         */
        default WordpressEndpointBuilder force(boolean force) {
            doSetProperty("force", force);
            return this;
        }
        /**
         * Whether to bypass trash and force deletion.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param force the value to set
         * @return the dsl builder
         */
        default WordpressEndpointBuilder force(String force) {
            doSetProperty("force", force);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param id the value to set
         * @return the dsl builder
         */
        default WordpressEndpointBuilder id(Integer id) {
            doSetProperty("id", id);
            return this;
        }
        /**
         * The entity ID. Should be passed when the operation performed requires
         * a specific entity, e.g. deleting a post.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param id the value to set
         * @return the dsl builder
         */
        default WordpressEndpointBuilder id(String id) {
            doSetProperty("id", id);
            return this;
        }
        /**
         * Password from authorized user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default WordpressEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Search criteria.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.wordpress.api.model.SearchCriteria&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param searchCriteria the value to set
         * @return the dsl builder
         */
        default WordpressEndpointBuilder searchCriteria(
                org.apache.camel.component.wordpress.api.model.SearchCriteria searchCriteria) {
            doSetProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * Search criteria.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.wordpress.api.model.SearchCriteria&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param searchCriteria the value to set
         * @return the dsl builder
         */
        default WordpressEndpointBuilder searchCriteria(String searchCriteria) {
            doSetProperty("searchCriteria", searchCriteria);
            return this;
        }
        /**
         * The Wordpress API URL from your site, e.g.
         * http://myblog.com/wp-json/.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: common
         * 
         * @param url the value to set
         * @return the dsl builder
         */
        default WordpressEndpointBuilder url(String url) {
            doSetProperty("url", url);
            return this;
        }
        /**
         * Authorized user to perform writing operations.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param user the value to set
         * @return the dsl builder
         */
        default WordpressEndpointBuilder user(String user) {
            doSetProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Wordpress component.
     */
    public interface AdvancedWordpressEndpointBuilder
            extends
                AdvancedWordpressEndpointConsumerBuilder,
                AdvancedWordpressEndpointProducerBuilder {
        default WordpressEndpointBuilder basic() {
            return (WordpressEndpointBuilder) this;
        }
    }

    public interface WordpressBuilders {
        /**
         * Wordpress (camel-wordpress)
         * Manage posts and users using Wordpress API.
         * 
         * Category: cloud,api,cms
         * Since: 2.21
         * Maven coordinates: org.apache.camel:camel-wordpress
         * 
         * Syntax: <code>wordpress:operation</code>
         * 
         * Path parameter: operation (required)
         * The endpoint operation.
         * There are 2 enums and the value can be one of: post, user
         * 
         * Path parameter: operationDetail
         * The second part of an endpoint operation. Needed only when endpoint
         * semantic is not enough, like wordpress:post:delete
         * There are 1 enums and the value can be one of: delete
         * 
         * @param path operation
         * @return the dsl builder
         */
        default WordpressEndpointBuilder wordpress(String path) {
            return WordpressEndpointBuilderFactory.endpointBuilder("wordpress", path);
        }
        /**
         * Wordpress (camel-wordpress)
         * Manage posts and users using Wordpress API.
         * 
         * Category: cloud,api,cms
         * Since: 2.21
         * Maven coordinates: org.apache.camel:camel-wordpress
         * 
         * Syntax: <code>wordpress:operation</code>
         * 
         * Path parameter: operation (required)
         * The endpoint operation.
         * There are 2 enums and the value can be one of: post, user
         * 
         * Path parameter: operationDetail
         * The second part of an endpoint operation. Needed only when endpoint
         * semantic is not enough, like wordpress:post:delete
         * There are 1 enums and the value can be one of: delete
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path operation
         * @return the dsl builder
         */
        default WordpressEndpointBuilder wordpress(
                String componentName,
                String path) {
            return WordpressEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static WordpressEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class WordpressEndpointBuilderImpl extends AbstractEndpointBuilder implements WordpressEndpointBuilder, AdvancedWordpressEndpointBuilder {
            public WordpressEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new WordpressEndpointBuilderImpl(path);
    }
}