package com.bosch.bic.samples.javaboschiotthingssample;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "things-api")
public class ThingsServiceConfigurationProperties {

    private String tokenEndpoint;
    private String clientId;
    private String clientSecret;
    private String[] scopes;
    private String websocketEndpoint;
}
