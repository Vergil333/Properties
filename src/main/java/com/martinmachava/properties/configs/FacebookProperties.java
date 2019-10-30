package com.martinmachava.properties.configs;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource("classpath:application.properties") No need because file is located in default path
@ConfigurationProperties(prefix = "facebook")
@Getter
@Setter
@ToString
public class FacebookProperties {

    private String host;
    private String apiVersion;
    private String appAccessToken;
    private String invalidToken;
    private String validToken;
    private Long validUser;
    private Long invalidUser;

}
