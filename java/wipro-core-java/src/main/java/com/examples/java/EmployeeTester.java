package com.examples.java;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		System.out.println(employee.getEmpid()+" "+employee.getName());
		System.out.println(employee.getDepartment()+" "+employee.getDesgination());
		employee.setDepartment("Finance");
		employee.setDesgination("Sr Manager");
		System.out.println(employee.getEmpid()+" "+employee.getName());
		System.out.println(employee.getDepartment()+" "+employee.getDesgination());

	}

}
