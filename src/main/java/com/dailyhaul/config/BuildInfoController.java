package com.dailyhaul.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildInfoController {

    @Value("${build.id:default}") // will load default values (application.yml build specs) if on-profile is not specified
    private String buildId;

    @Value("${build.version:default}")
    private String buildVersion;

    @Value("${build.name:default}")
    private String buildName;

    @GetMapping("/build-info")
    public String getBuildInfo() {
        return "Build id: " + buildId + ", version: " + buildVersion + ", name: " + buildName;
    }

}
