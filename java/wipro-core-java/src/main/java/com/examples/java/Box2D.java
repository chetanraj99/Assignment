package com.examples.java;

public class Box2D {
	
	int length;
	int breadth;
	
	public Box2D() {
		length=10;
		breadth=20;
	}
	
	public Box2D(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}

	public void calSurfaceArea() {
		System.out.println("Inside the box2d class");
		System.out.println("Surface area is : "+length*breadth);
	}
	
	public void test() {
		System.out.println("Inside the test method of box2d");
	}
}
