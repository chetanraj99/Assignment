package com.examples.reactive;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class BackpressureHandlingExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Flux<Integer> numbers = Flux.range(1, 100)
								.onBackpressureBuffer(10, i->System.out.println("Dropped item is "+i));
		
		numbers.publishOn(Schedulers.boundedElastic())
		.subscribe(
				data -> {
					System.out.println("Data received is "+data);
					try {
						Thread.sleep(100);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				
				}, err -> System.err.println("Error -->"+err),
                () -> System.out.println("Completed")
				
				
				);
		
		Thread.sleep(15000);
	}

}
