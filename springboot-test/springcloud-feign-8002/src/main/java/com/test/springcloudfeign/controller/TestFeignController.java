package com.test.springcloudfeign.controller;

import com.test.springcloudfeign.feign.TestFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test/springcloud-feign")
public class TestFeignController {
    @Resource
    private TestFeign testFeign;

    @GetMapping("/feign")
    public String getDate(){
        return testFeign.getDate();
    }

    @GetMapping("/hello")
    public String testHello(){
        return testFeign.hello();
    }
}
