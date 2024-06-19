package com.sapient.asde.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HelloConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloConfigServerApplication.class, args);
	}

}
