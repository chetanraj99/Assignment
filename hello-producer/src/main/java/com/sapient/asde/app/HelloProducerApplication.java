package com.sapient.asde.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.sapient.asde")
@EnableEurekaClient
public class HelloProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloProducerApplication.class, args);
	}

}
