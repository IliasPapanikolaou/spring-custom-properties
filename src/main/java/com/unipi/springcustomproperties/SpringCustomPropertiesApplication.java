package com.unipi.springcustomproperties;

import com.unipi.springcustomproperties.model.ConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class SpringCustomPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCustomPropertiesApplication.class, args);
    }
}
