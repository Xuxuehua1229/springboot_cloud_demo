package com.test.springcloudconsumerfeign1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableFeignClients({"com.test.springcloudfeignhystrix.feign"})
@ComponentScan(basePackages = {"com.test.springcloudfeignhystrix.factory",
		"com.test.springcloudfeignhystrix.feign" })
@EnableCircuitBreaker
public class SpringcloudConsumerFeign1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsumerFeign1Application.class, args);
	}

}
