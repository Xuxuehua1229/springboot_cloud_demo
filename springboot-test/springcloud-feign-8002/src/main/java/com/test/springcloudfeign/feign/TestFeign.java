package com.test.springcloudfeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "springbootapi")
public interface TestFeign {

    @GetMapping("/test/springboot-api/get")
    String getDate();

    @GetMapping("/test/springboot-api/hello")
    String hello();
}
