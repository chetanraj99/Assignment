package com.examples.java;

public class College {

	static String name;
	String state;

	public void DisplayData() {
		System.out.println("College Name: " + name + " State " + state);
	}

	public static void sample() {
		System.out.println("This is my sample method ");
	}

	static {
		System.out.println("Inside the static block");
	}

	{
		System.out.println("Inside the non static block");
	}

}
