package com.examples.java;

public class Box3D extends Box2D{
	
	int height;
	int length;
	int breadth;
	
	Box3D(){
		
		length=5;
		breadth=4;
		height=1;
	}
	public void calSurfaceArea() {
		System.out.println("Inside the box3d class");
		System.out.println("Surface area is : "+length*breadth);
	}
	
	public void calVolume() {
		System.out.println("The Volume is : "+length*super.breadth*height);
	}
	
	public void test() {
		System.out.println("Inside the test method of box3d");
	}

}
