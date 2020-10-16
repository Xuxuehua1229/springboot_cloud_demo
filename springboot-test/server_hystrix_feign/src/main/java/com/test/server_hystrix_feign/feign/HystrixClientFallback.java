package com.test.server_hystrix_feign.feign;


import com.test.springbootutils.bean.User;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements HystrixFeignClient {
    @Override
    public User findFeignById(Long id) {
        System.out.println("进入FeignClient熔断降级方法");
        User user = new User();
        user.setId(Long.valueOf(0));
        user.setAge(28);
        user.setName("abc");
        user.setUsername("zhangsan");
        return user;
    }
}
