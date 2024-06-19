package com.example.reactive.webclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ReactRestCrudWebclientProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactRestCrudWebclientProjectApplication.class, args);
	}
	
	@Bean
	public WebClient webClient() {
		return WebClient.create("http://localhost:8082");
	}

}
