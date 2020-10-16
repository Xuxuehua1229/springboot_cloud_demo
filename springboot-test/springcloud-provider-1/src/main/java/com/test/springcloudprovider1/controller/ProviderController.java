package com.test.springcloudprovider1.controller;

import com.test.springcloudprovider1.service.impl.StudentServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class ProviderController {

    @Resource
    private StudentServiceImpl studentService;

    @RequestMapping(value = "/provider/map", produces = "application/json; charset=utf-8", method = {
            RequestMethod.POST, RequestMethod.GET })
    public Map<String, Object> map() {
        System.out.println("ProviderController----我是生产者1");
        return studentService.getInfo();
    }

    @RequestMapping(value = "/provider/mapHystrix", produces = "application/json; charset=utf-8", method = {
            RequestMethod.POST, RequestMethod.GET })
    public Map<String, Object> mapHystrix() throws InterruptedException {
        //模拟调用延迟
        //Thread.sleep(1000);
        System.out.println("ProviderController----我是生产者1");
        // 模拟调用服务超时
        // 然后采取 Hystrix进行服务降级，进而熔断该节点的服务调用，快速返回自定义的错误影响页面信息。
        return studentService.getInfo();
    }
}
