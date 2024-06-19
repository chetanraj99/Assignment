package com.examples.java;

public class RectangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle1 = new Rectangle();
		rectangle1.readData();
		rectangle1.calculateArea();
		rectangle1.calculateVolume();
		rectangle1.length=20;
		rectangle1.calculateArea();
		rectangle1.calculateVolume();
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.readData();
		rectangle2.calculateArea();
		rectangle2.calculateVolume();
		

	}

}
