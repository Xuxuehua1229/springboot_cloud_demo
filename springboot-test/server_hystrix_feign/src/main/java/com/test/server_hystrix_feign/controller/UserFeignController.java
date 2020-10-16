package com.test.server_hystrix_feign.controller;

import com.test.server_hystrix_feign.feign.HystrixFeignClient;
import com.test.springbootutils.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class UserFeignController {

    @Autowired
    HystrixFeignClient hystrixFeignClient;

    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET)
    public User findUserInfoById(@PathVariable("id") Long id){
        return hystrixFeignClient.findFeignById(id);
    }
}
