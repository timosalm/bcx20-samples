package com.bosch.bic.samples.javaboschiotthingssample;

import lombok.RequiredArgsConstructor;
import org.eclipse.ditto.client.DittoClient;
import org.eclipse.ditto.client.DittoClients;
import org.eclipse.ditto.client.configuration.ClientCredentialsAuthenticationConfiguration;
import org.eclipse.ditto.client.configuration.WebSocketMessagingConfiguration;
import org.eclipse.ditto.client.messaging.AuthenticationProviders;
import org.eclipse.ditto.client.messaging.MessagingProviders;
import org.eclipse.ditto.model.base.json.JsonSchemaVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@RequiredArgsConstructor
@Configuration
public class ThingsServiceConfiguration {

    private final ThingsServiceConfigurationProperties configurationProperties;

    @Bean
    public DittoClient getDittoClient() {
        var authenticationProviderConfiguration = ClientCredentialsAuthenticationConfiguration.newBuilder()
                .clientId(this.configurationProperties.getClientId())
                .clientSecret(this.configurationProperties.getClientSecret())
                .scopes(Arrays.asList(this.configurationProperties.getScopes()))
                .tokenEndpoint(this.configurationProperties.getTokenEndpoint())
                .build();
        var authenticationProvider = AuthenticationProviders.clientCredentials(authenticationProviderConfiguration);

        var messagingProviderConfiguration = WebSocketMessagingConfiguration.newBuilder()
                .endpoint(this.configurationProperties.getWebsocketEndpoint())
                .jsonSchemaVersion(JsonSchemaVersion.V_1)
                .build();
        var messagingProvider = MessagingProviders.webSocket(messagingProviderConfiguration, authenticationProvider);

        return DittoClients.newInstance(messagingProvider);
    }
}
