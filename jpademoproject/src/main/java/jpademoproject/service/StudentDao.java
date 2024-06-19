package jpademoproject.service;

import java.util.List;

import jpademoproject.models.Student;

public interface StudentDao {
	
	public void insertEntity(Student student);
	public void findEntity(int id);
	public void updateEntity();
	public List<Student> getAll();
	public void removeEntity(int id);

}
