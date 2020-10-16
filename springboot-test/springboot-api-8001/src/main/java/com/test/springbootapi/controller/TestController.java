package com.test.springbootapi.controller;

import com.test.springbootutils.hepler.CommonMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/test/springboot-api")
public class TestController {

    @GetMapping("/get")
    public String getDate(){
        Date d = CommonMethod.getCurDate();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return s.format(d);
    }

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello hahahahaha");
        return "Hello World!";
    }
}
