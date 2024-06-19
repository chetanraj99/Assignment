package com.example.webclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class WebclientApplication implements CommandLineRunner {

	private WebClient webClient;

	public static void main(String[] args) {
		SpringApplication.run(WebclientApplication.class, args);
	}

	public Mono<String> getHello() {
		 return webClient.get().uri("/hello").retrieve().bodyToMono(String.class);
	}

	public Mono<Integer> getNumberById(int id) {
		return webClient.get().uri("/numbers/{id}", id).retrieve().bodyToMono(Integer.class);
	}

	public Flux<Integer> getNumbers() {
		return webClient.get().uri("/numbers").retrieve().bodyToFlux(Integer.class);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		webClient = WebClient.create("http://localhost:8080");
		
		getHello().subscribe(System.out::println);
		
		getNumberById(5).subscribe(System.out::println);
		
		getNumbers().subscribe(System.out::println);

	}

}
