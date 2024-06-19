package com.examples.java;

public class Box {
	
	int length;
	int breadth;
	int area;
	Box(){
		length=1;
		breadth=2;
		System.out.println("Inside the default construtor");
	}
	
	Box(int length){
		this.length=length;
		breadth=1;
		System.out.println("Inside the one parameter construtor");
	}
	Box(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
		System.out.println("Inside the two parameters construtor");
	}

	public void calArea() {
		area = length*breadth;
		System.out.println("The area is : "+area);
	}
}
