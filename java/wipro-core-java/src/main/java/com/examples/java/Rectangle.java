package com.examples.java;

import java.util.Scanner;

public class Rectangle {
	// instance variables / non static variables
	int length;
	int breadth;
	int height;
	int area;
	int volume;
	Scanner sc;
	
	//methods
	public void readData() {
		int a=10 ; //method varible or local variable
		sc= new Scanner(System.in);
		System.out.println("Enter length value");
		length = sc.nextInt();
		System.out.println("Enter breadth value");
		breadth = sc.nextInt();
		System.out.println("Enter height ");
		height = sc.nextInt();
	}
	
	public void calculateArea() {
		area = length*breadth;
		//System.out.println(a);
		System.out.println("The Area is :"+area);
	}
	
	public void calculateVolume() {
		volume = length*height*breadth;
		System.out.println("The volume is "+volume);
	}
}
