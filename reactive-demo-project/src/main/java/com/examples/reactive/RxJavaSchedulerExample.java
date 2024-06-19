package com.examples.reactive;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class RxJavaSchedulerExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Creating the observable
		Observable<Integer> numbers = Observable.just(1,2,3,4,5,6,7,8,9,10);
		
		
		//Apply a transformation to the emitted data
		numbers.subscribeOn(Schedulers.computation())
		       .map(item->{
		    	 System.out.println("Mapping "+item+" on Thread "+Thread.currentThread().getName());
		    	 return item*2;
		       })
		       .observeOn(Schedulers.io())
		       .subscribe(
		    		   item ->System.out.println("Received "+item +" on Thread "+Thread.currentThread().getName()),
		       Throwable::printStackTrace,
		       ()->{
		    	   
		    	   System.out.println("completed...");
		       }
		    		   );
		Thread.sleep(1000);
	}

}
