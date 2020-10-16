package com.test.springcloudnacosconfig7001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NacosConfigController2 {

    /*@Value("${config.appName}")
    public String appName;

    @Value("${user.name}")
    public String userName;

    @Value("${user.age}")
    private Integer userAge;

    @GetMapping("/nacos-config2")
    public 	String nacosConfig() {

        return  userName + "======>" + appName;
    }

    @GetMapping("/nacosvalues")
    public Map<String, Object> nacosValuesMap(){
        Map<String, Object> map = Maps.newHashMap();
        map.put("name", userName);
        map.put("age", userAge);
        return map;
    }*/


    /*@Value("${nacos.share}")
    private String share;

    @Value("${share.config1}")
    private String shareConfig1;

    @Value("${share.config2}")
    private String shareConfig2;

    @Value("${share.config3}")
    private String shareConfig3;

    @Value("${share.config4}")
    private String shareConfig4;

    @Value("${share.config5}")
    private String shareConfig5;


    @RequestMapping("/getValue")
    public String getValue() {
        return share;
    }

    @RequestMapping("/getShare1")
    public String getShare1() {
        return shareConfig1;
    }

    @RequestMapping("/getShare2")
    public String getShare2() {
        return shareConfig2;
    }

    @RequestMapping("/getShare3")
    public String getShare3() {
        return shareConfig3;
    }

    @RequestMapping("/getShare4")
    public String getShare4() {
        return shareConfig4;
    }

    @RequestMapping("/getShare5")
    public String getShare5(){
        return shareConfig5;
    }*/

    @Value("${config.appName}")
    private String appName;

    @Value("${config.description}")
    private String description;

    @Value("${config.appName1}")
    private String appName1;

    @Value("${config.description1}")
    private String description1;

    @Value("${config.appName2}")
    private String appName2;

    @Value("${config.description2}")
    private String description2;

    @Value("${config.appName3}")
    private String appName3;

    @Value("${config.description3}")
    private String description3;

    @Value("${config.appName4}")
    private String appName4;

    @Value("${config.description4}")
    private String description4;

    @GetMapping("/share-config")
    public 	String shareConfig() {
        return  appName + "======>" + description;
    }

    @GetMapping("/share-config1")
    public 	String shareConfig1() {
        return  appName1 + "======>" + description1;
    }

    @GetMapping("/share-config2")
    public 	String shareConfig2() {
        return  appName2 + "======>" + description2;
    }

    @GetMapping("/share-config3")
    public 	String shareConfig3() {
        return  appName3 + "======>" + description3;
    }

    @GetMapping("/share-config4")
    public 	String shareConfig4() {
        return  appName4 + "======>" + description4;
    }
}
