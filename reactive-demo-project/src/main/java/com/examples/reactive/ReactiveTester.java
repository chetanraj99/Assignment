package com.examples.reactive;

import java.util.ArrayList;
import java.util.function.Consumer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("List of numbers are: without reactive programming");
		Consumer<Integer> c= (x)->{
			int fact =1;
			for (int i = 1; i <= x; i++) {
				fact *= i;
			}
			System.out.println("Factorial of "+x+" is "+fact);
		};
		list.forEach(c);
		// Creating the publisher
		Flux<Integer> numbers = Flux.just(1,2,3,4,5,6,7,8,9,10);
		Mono<Integer> singleNumber = Mono.just(1);
		
		Flux<String> names = Flux.just("John", "Doe", "Jane", "Smith");
		Mono<String> singleName = Mono.just("John");
		
		// Subscribing to the publisher
		System.out.println("Subcribed numbers are:");
		numbers.subscribe(System.out::println);
		singleNumber.subscribe(System.out::println);
		names.subscribe(System.out::println);
		singleName.subscribe(System.out::println);
		
		// Subscribing with publisher
		numbers.subscribe(c);
		
		//transforming the data
		System.out.println("Transformed numbers are:");
		Flux<Integer> transformedNumbers = numbers.map(x->x*x);
		transformedNumbers.subscribe(System.out::println);
		
		// combining the streams
		System.out.println("Combined streams are:");
		Flux<String> combinedFlux = Flux.concat(names, Flux.just("Alice", "Bob"));
		combinedFlux.subscribe(System.out::println);
		
		// Filtering the data
		System.out.println("Even numbers are:");
		Flux<Integer> filteredNumbers = numbers.filter(x->x%2==0);
		filteredNumbers.subscribe(System.out::println);
		
		//Handlin the errors
		System.out.println("Handling errors:");
		Flux<Integer> errorNumbers = Flux.just(1, 2, 3, 4, 5)
				.concatWith(Flux.error(new RuntimeException("Exception Occurred")))
				.onErrorResume(e->{
					System.out.println("Exception is: "+e.getMessage());
				return Flux.just(1,2,3,4,5);
				});
	    errorNumbers.subscribe(System.out::println);
		
	}

}
