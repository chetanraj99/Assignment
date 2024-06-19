package com.examples.java;

public class Student {
	
	String name;
	String branch;
	String address;
	
	Student(){
		//this();
		name="No Name";
		System.out.println("Inside the default constructor");
	}
	
	Student(String name){
		//this();
		this.name=name;
		
		System.out.println("Inside the parameterized constructor");
	}
	public void display() {
		System.out.println("Inside the zero parameter");
	}
	public void display(int a) {
		System.out.println("Inside the one  parameter");
	}
	
	public void display(int a, int b) {
		System.out.println("Inside the two parameter");
	}
	public void showDetails() {
		//this();
		System.out.println("Name : "+name+" branch :"+branch+" Address "+address);
	}
}
