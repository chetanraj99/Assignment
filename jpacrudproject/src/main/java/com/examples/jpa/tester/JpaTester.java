package com.examples.jpa.tester;

import com.examples.jpa.model.Employee;
import com.examples.jpa.model.Notes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PERSISTANCE_UNIT_NAME = "PERSISTENCE";
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		//Notes note = new Notes(1001,"Mohan","Oracle","Best RDMS database");
		//Employee emp = new Employee(9002,"Anil","Quality","Team Lead");
		//entityManager.persist(emp);
		Employee e = entityManager.find(Employee.class, 9001);
		entityManager.remove(e);
		System.out.println("Emp with 9001 id remvoed..");
		txn.commit();
		//System.out.println("Employee Entity Inserted");
		entityManager.close();
		factory.close();

	}

}
