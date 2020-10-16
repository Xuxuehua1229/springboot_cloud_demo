package com.test.server_hystrix_feign.feign;


import com.test.springbootutils.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-provider-user",fallback = HystrixClientFallback.class)
public interface HystrixFeignClient {
    @RequestMapping(value = "/findUser/{id}",method = RequestMethod.GET)
    User findFeignById(@PathVariable(value = "id") Long id);
}
