package com.examples.java;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> stringSupplier = ()-> "Hello, World";
		Supplier<Double> s1 = () -> Math.random();
		
		System.out.println(stringSupplier.get());
		System.out.println(stringSupplier.get());
		System.out.println(stringSupplier.get());
		
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		
		

	}

}
