package com.dailyhaul.config;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BuildInfoController {

//    @Value("${build.id:default}") // will load default values (application.yml build specs) if on-profile is not specified
//    private String buildId;
//
//    @Value("${build.version:default}")
//    private String buildVersion;
//
//    @Value("${build.name:default}")
//    private String buildName;

    private BuildInfo buildInfo;

    @GetMapping("/build-info")
    public String getBuildInfo() {
        return "Build id: " + buildInfo.getId() + ", version: " + buildInfo.getVersion() + ", name: " + buildInfo.getName();
    }

}
