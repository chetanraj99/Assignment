package com.examples.reactive;

import reactor.core.publisher.Flux;

public class ReactorFlatMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flux<Flux<String>> nestedFlux = Flux.just(Flux.just("a", "b"), 
												  Flux.just("c", "d"), 
												  Flux.just("e", "f")
												  );
		
		Flux<String> flatMappedFlux = nestedFlux.flatMap(flux -> flux);
		flatMappedFlux.subscribe(System.out::println);

	}

}
