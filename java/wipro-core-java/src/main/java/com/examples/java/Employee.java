package com.examples.java;

public class Employee {
	
	private int empid;
	private String name;
	private String department;
	private String desgination;
	
	public Employee() {
		empid=1001;
		name="Kumar";
		department="Quality";
		desgination="Manager";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesgination() {
		return desgination;
	}

	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	
	

}
