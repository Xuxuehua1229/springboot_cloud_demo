package com.test.springcloudfeignhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.test.springcloudfeignhystrix.feign.FeignClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ConsumerController {

    @Resource
    private FeignClientService feignClientService;

    @RequestMapping("/consumer/mapHystrix")
    @HystrixCommand(fallbackMethod = "fallFindByIdBack")
    public Map<String, Object> mapHystrix(){
        System.out.println("ConsumerController----我是消费者1");
        // 模拟调用服务超时
        // 然后采取 Hystrix进行服务降级，进而熔断该节点的服务调用，快速返回自定义的错误影响页面信息。
        return feignClientService.getInfo();
    }

    public Map<String, Object> fallFindByIdBack(){
        System.out.println("进入熔断降级方法");
        Map<String,Object> map = new HashMap<>();
        map.put("name","系统繁忙，请稍后重试....服务提供者------1");
        map.put("code",500);
        return map;
    }
}
