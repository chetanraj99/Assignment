package com.example.springwebflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class WebFluxController {
	
	@GetMapping("/hello")
	public Mono<String> sayHello() {
		return Mono.just("Hello World");
	}
	
	@GetMapping("/numbers")
	public Flux<Integer> getNumbers() {
		return Flux.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}
	
	@GetMapping("/numbers/{id}")
	public Mono<Integer> getNumberById(@PathVariable int id) {
		return Mono.just(id*2);
	}

}
