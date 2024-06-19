package com.examples.java;

public interface StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Anil");
		//Student student2 = new Student();
		student1.showDetails();
		student1.display(10);
		student1.display();
		student1.display(10,20);
		//student2.showDetails();
	}

}
