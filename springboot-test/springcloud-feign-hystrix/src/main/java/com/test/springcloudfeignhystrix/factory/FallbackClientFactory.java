package com.test.springcloudfeignhystrix.factory;

import com.test.springcloudfeignhystrix.feign.FeignClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FallbackClientFactory implements FallbackFactory<FeignClientService> {


    @Override
    public FeignClientService create(Throwable throwable) {
        System.out.println("进入FallbackClientFactory......");
        return () -> {
            Map<String,Object> map = new HashMap<>();
            map.put("name","系统繁忙，请稍后重试....服务提供者------1");
            map.put("code",500);
            return map;
        };
    }
}
