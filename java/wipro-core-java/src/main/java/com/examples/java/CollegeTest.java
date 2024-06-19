package com.examples.java;

public class CollegeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College college1 = new College();
		College college2 = new College();
		College.name="JNTU";
		//college1.name="MGIT";
		college1.state="Telengana";
		college1.DisplayData();
		college2.name="RGPV";
		college2.state="Madhya Pradesh";
		college2.DisplayData();
		//college1.name="JNTU";
		college1.DisplayData();
		college2.DisplayData();
		
		College.sample();
		

	}

}
