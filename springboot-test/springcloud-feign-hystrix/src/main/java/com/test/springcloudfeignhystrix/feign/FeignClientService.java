package com.test.springcloudfeignhystrix.feign;

import com.test.springcloudfeignhystrix.factory.FallbackClientFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@FeignClient(value = "provider01",fallbackFactory = FallbackClientFactory.class)
public interface FeignClientService {

    //@RequestMapping(value = "/provider/mapHystrix", produces = "application/json; charset=utf-8", method = {
           //RequestMethod.POST, RequestMethod.GET })
    @PostMapping("/provider/mapHystrix")
    Map<String,Object> getInfo();
}
