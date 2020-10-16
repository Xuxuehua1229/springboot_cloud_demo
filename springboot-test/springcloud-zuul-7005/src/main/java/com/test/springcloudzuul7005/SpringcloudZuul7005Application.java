package com.test.springcloudzuul7005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringcloudZuul7005Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudZuul7005Application.class, args);
	}

}
