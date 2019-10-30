package com.martinmachava.properties;

import com.martinmachava.properties.configs.FacebookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableConfigurationProperties(FacebookProperties.class)
public class PropertiesApplication {

    private static FacebookProperties fbProperties;
    @Autowired
    private FacebookProperties facebookProperties;

    public static void main(String[] args) {
        SpringApplication.run(PropertiesApplication.class, args);

        System.out.println(fbProperties.toString());
    }

    @PostConstruct
    public void init() {
        this.fbProperties = facebookProperties;
    }

}
