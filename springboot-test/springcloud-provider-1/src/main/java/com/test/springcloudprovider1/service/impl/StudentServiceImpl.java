package com.test.springcloudprovider1.service.impl;

import com.test.springcloudprovider1.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Map<String, Object> getInfo() {
        Map<String, Object> map = new HashMap<>();

        //如果是第二个服务就写成  2， 测试时方便观察
        map.put("name","业务数据xxxxxxxxxxxxxxxxx....服务提供者------1");
        map.put("code",200);

        return map;

    }
}
