package com.bosch.bic.samples.javaboschiotthingssample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan("com.bosch.bic.samples.javaboschiotthingssample")
@SpringBootApplication
public class ThingsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThingsApplication.class, args);
    }

}
