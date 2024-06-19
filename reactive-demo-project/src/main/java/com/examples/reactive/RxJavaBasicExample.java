package com.examples.reactive;

import io.reactivex.rxjava3.core.Observable;

public class RxJavaBasicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating the observable
		Observable<Integer> numbers = Observable.just(1,2,3,4,5,6,7,8,9,10);
		
		//Apply a transformation to the emitted data
		numbers.map(x->2*x)
				.subscribe(
						//onNext
						data -> System.out.println("Data received is "+data),
						//onError
						Throwable::printStackTrace,
						
						//onComplete
						()->System.out.println("Completed")
                        						
						);
	}

}
