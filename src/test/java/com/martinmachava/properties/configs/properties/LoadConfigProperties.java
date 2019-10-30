package com.martinmachava.properties.configs.properties;

import com.martinmachava.properties.configs.FacebookProperties;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableAutoConfiguration
@EnableConfigurationProperties(value = { FacebookProperties.class })
public class LoadConfigProperties {
}
