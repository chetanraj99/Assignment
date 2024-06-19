package jpademoproject.mains;

import java.util.List;

import jpademoproject.models.Student;
import jpademoproject.service.StudentDaoImpl;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDaoImpl dao = new StudentDaoImpl();
	//	Student student = new Student("amar","kumar","amar@gmail.com");
		
     //   dao.insertEntity(student);
      // dao.findEntity(2);
       // dao.updateEntity();
       // dao.removeEntity(2);
		List<Student> students = dao.getAll();
        students.forEach(System.out::println);
        System.out.println("All operations done");

	}

}
