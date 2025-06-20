package com.dailyhaul.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "build")
@Data
public class BuildInfo { // maps "builder: " from application.yml

    private String id;
    private String version;
    private String name;
}
