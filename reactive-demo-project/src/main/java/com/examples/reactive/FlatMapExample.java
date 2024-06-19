package com.examples.reactive;

import java.util.Arrays;
import java.util.List;

import reactor.core.publisher.Flux;

public class FlatMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> nestedList = Arrays.asList(
					Arrays.asList("a","b"),
					Arrays.asList("c","d"),
					Arrays.asList("e","f")
				);
		Flux.fromIterable(nestedList)
		     .flatMap(list -> Flux.fromIterable(list))
		     .subscribe(System.out::println);

	}

}
