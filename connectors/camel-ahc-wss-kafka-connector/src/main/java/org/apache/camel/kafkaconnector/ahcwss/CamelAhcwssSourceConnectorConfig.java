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
package org.apache.camel.kafkaconnector.ahcwss;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAhcwssSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AHCWSS_PATH_HTTP_URI_CONF = "camel.source.path.httpUri";
    public static final String CAMEL_SOURCE_AHCWSS_PATH_HTTP_URI_DOC = "The URI to use such as http://hostname:port/path";
    public static final String CAMEL_SOURCE_AHCWSS_PATH_HTTP_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_BRIDGE_ENDPOINT_CONF = "camel.source.endpoint.bridgeEndpoint";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_BRIDGE_ENDPOINT_DOC = "If the option is true, then the Exchange.HTTP_URI header is ignored, and use the endpoint's URI for request. You may also set the throwExceptionOnFailure to be false to let the AhcProducer send all the fault response back.";
    public static final Boolean CAMEL_SOURCE_AHCWSS_ENDPOINT_BRIDGE_ENDPOINT_DEFAULT = false;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_BUFFER_SIZE_CONF = "camel.source.endpoint.bufferSize";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_BUFFER_SIZE_DOC = "The initial in-memory buffer size used when transferring data between Camel and AHC Client.";
    public static final Integer CAMEL_SOURCE_AHCWSS_ENDPOINT_BUFFER_SIZE_DEFAULT = 4096;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.source.endpoint.headerFilterStrategy";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_CONF = "camel.source.endpoint.throwExceptionOnFailure";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DOC = "Option to disable throwing the AhcOperationFailedException in case of failed responses from the remote server. This allows you to get all responses regardless of the HTTP status code.";
    public static final Boolean CAMEL_SOURCE_AHCWSS_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DEFAULT = true;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_TRANSFER_EXCEPTION_CONF = "camel.source.endpoint.transferException";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_TRANSFER_EXCEPTION_DOC = "If enabled and an Exchange failed processing on the consumer side, and if the caused Exception was send back serialized in the response as a application/x-java-serialized-object content type (for example using Jetty or Servlet Camel components). On the producer side the exception will be deserialized and thrown as is, instead of the AhcOperationFailedException. The caused exception is required to be serialized. This is by default turned off. If you enable this then be aware that Java will deserialize the incoming data from the request to Java and that can be a potential security risk.";
    public static final Boolean CAMEL_SOURCE_AHCWSS_ENDPOINT_TRANSFER_EXCEPTION_DEFAULT = false;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_AHCWSS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_SEND_MESSAGE_ON_ERROR_CONF = "camel.source.endpoint.sendMessageOnError";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_SEND_MESSAGE_ON_ERROR_DOC = "Whether to send an message if the web-socket listener received an error.";
    public static final Boolean CAMEL_SOURCE_AHCWSS_ENDPOINT_SEND_MESSAGE_ON_ERROR_DEFAULT = false;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_AHCWSS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_BINDING_CONF = "camel.source.endpoint.binding";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_BINDING_DOC = "To use a custom AhcBinding which allows to control how to bind between AHC and Camel.";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_BINDING_DEFAULT = null;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_CONF = "camel.source.endpoint.clientConfig";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_DOC = "To configure the AsyncHttpClient to use a custom com.ning.http.client.AsyncHttpClientConfig instance.";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_DEFAULT = null;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_OPTIONS_CONF = "camel.source.endpoint.clientConfigOptions";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_OPTIONS_DOC = "To configure the AsyncHttpClientConfig using the key/values from the Map.";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_AHCWSS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_REALM_OPTIONS_CONF = "camel.source.endpoint.clientConfigRealmOptions";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_REALM_OPTIONS_DOC = "To configure the AsyncHttpClientConfig Realm using the key/values from the Map.";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_REALM_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.source.endpoint.sslContextParameters";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "Reference to a org.apache.camel.support.jsse.SSLContextParameters in the Registry. This reference overrides any configured SSLContextParameters at the component level. See Using the JSSE Configuration Utility. Note that configuring this option will override any SSL/TLS configuration options provided through the clientConfig option at the endpoint or component level.";
    public static final String CAMEL_SOURCE_AHCWSS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.ahc-wss.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_AHCWSS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_CONF = "camel.component.ahc-wss.allowJavaSerializedObject";
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DOC = "Whether to allow java serialization when a request uses context-type=application/x-java-serialized-object This is by default turned off. If you enable this then be aware that Java will deserialize the incoming data from the request to Java and that can be a potential security risk.";
    public static final Boolean CAMEL_SOURCE_AHCWSS_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DEFAULT = false;
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.ahc-wss.basicPropertyBinding";
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_AHCWSS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_BINDING_CONF = "camel.component.ahc-wss.binding";
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_BINDING_DOC = "To use a custom AhcBinding which allows to control how to bind between AHC and Camel.";
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_BINDING_DEFAULT = null;
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_CLIENT_CONF = "camel.component.ahc-wss.client";
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_CLIENT_DOC = "To use a custom AsyncHttpClient";
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_CLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_CLIENT_CONFIG_CONF = "camel.component.ahc-wss.clientConfig";
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_CLIENT_CONFIG_DOC = "To configure the AsyncHttpClient to use a custom com.ning.http.client.AsyncHttpClientConfig instance.";
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_CLIENT_CONFIG_DEFAULT = null;
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_HEADER_FILTER_STRATEGY_CONF = "camel.component.ahc-wss.headerFilterStrategy";
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_HEADER_FILTER_STRATEGY_DOC = "To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.ahc-wss.sslContextParameters";
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "Reference to a org.apache.camel.support.jsse.SSLContextParameters in the Registry. Note that configuring this option will override any SSL/TLS configuration options provided through the clientConfig option at the endpoint or component level.";
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.ahc-wss.useGlobalSslContextParameters";
    public static final String CAMEL_SOURCE_AHCWSS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SOURCE_AHCWSS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;

    public CamelAhcwssSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAhcwssSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AHCWSS_PATH_HTTP_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AHCWSS_PATH_HTTP_URI_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AHCWSS_PATH_HTTP_URI_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_BRIDGE_ENDPOINT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AHCWSS_ENDPOINT_BRIDGE_ENDPOINT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_BRIDGE_ENDPOINT_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_BUFFER_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AHCWSS_ENDPOINT_BUFFER_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_BUFFER_SIZE_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AHCWSS_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AHCWSS_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_THROW_EXCEPTION_ON_FAILURE_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_TRANSFER_EXCEPTION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AHCWSS_ENDPOINT_TRANSFER_EXCEPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_TRANSFER_EXCEPTION_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AHCWSS_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_SEND_MESSAGE_ON_ERROR_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AHCWSS_ENDPOINT_SEND_MESSAGE_ON_ERROR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_SEND_MESSAGE_ON_ERROR_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AHCWSS_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AHCWSS_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AHCWSS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AHCWSS_ENDPOINT_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_OPTIONS_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AHCWSS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_REALM_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_REALM_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_CLIENT_CONFIG_REALM_OPTIONS_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AHCWSS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AHCWSS_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AHCWSS_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AHCWSS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SOURCE_AHCWSS_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_COMPONENT_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AHCWSS_COMPONENT_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_COMPONENT_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_COMPONENT_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AHCWSS_COMPONENT_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_COMPONENT_CLIENT_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_COMPONENT_CLIENT_CONFIG_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AHCWSS_COMPONENT_CLIENT_CONFIG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_COMPONENT_CLIENT_CONFIG_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_COMPONENT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AHCWSS_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_COMPONENT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AHCWSS_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_AHCWSS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AHCWSS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AHCWSS_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        return conf;
    }
}