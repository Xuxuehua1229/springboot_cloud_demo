package com.test.server_hystrix_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class ServerHystrixFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerHystrixFeignApplication.class, args);
	}

}
