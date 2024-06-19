package jpademoproject.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


import jpademoproject.models.Student;
import jpademoproject.utils.JPAUtil;

/**
 * JPA CRUD Operations
 * 
 * @author Ramesh Fadatare
 *
 */
public class StudentDaoImpl implements StudentDao{
	public void insertEntity(Student student) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
	//	Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
		entityManager.persist(student);
		txn.commit();
		entityManager.close();
	}

	public void findEntity(int id) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		Student student = entityManager.find(Student.class, id);
		System.out.println("student id :: " + student.getId());
		System.out.println("student firstname :: " + student.getFirstName());
		System.out.println("student lastname :: " + student.getLastName());
		System.out.println("student email :: " + student.getEmail());
		txn.commit();
		entityManager.close();
	}

	public void updateEntity() {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();

		Student student = entityManager.find(Student.class, 1);
		System.out.println("student id :: " + student.getId());
		System.out.println("student firstname :: " + student.getFirstName());
		System.out.println("student lastname :: " + student.getLastName());
		System.out.println("student email :: " + student.getEmail());

		// The entity object is physically updated in the database when the transaction
		// is committed
		student.setFirstName("Ram");
		student.setLastName("jadhav");
		txn.commit();
		entityManager.close();
	}

	public List<Student> getAll() {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();

		Query query = entityManager.createQuery("select p from Student p");
		return query.getResultList();
	

	}

	public void removeEntity(int id) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		Student student = entityManager.find(Student.class, id);
		System.out.println("student id :: " + student.getId());
		System.out.println("student firstname :: " + student.getFirstName());
		System.out.println("student lastname :: " + student.getLastName());
		System.out.println("student email :: " + student.getEmail());
		entityManager.remove(student);
		txn.commit();
		entityManager.close();
	}
}