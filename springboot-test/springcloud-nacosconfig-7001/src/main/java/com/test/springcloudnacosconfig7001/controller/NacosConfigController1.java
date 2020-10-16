package com.test.springcloudnacosconfig7001.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class NacosConfigController1 {
    @Resource
    private ConfigurableApplicationContext applicationContext;

    @GetMapping("/nacos-config1")
    public String nacosConfig(){
        return applicationContext.getEnvironment().getProperty("config.appName");
    }
}
