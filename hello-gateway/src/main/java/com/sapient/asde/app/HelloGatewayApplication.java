package com.sapient.asde.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HelloGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloGatewayApplication.class, args);
	}

}
