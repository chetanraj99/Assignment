package springproject.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");
		/*
		Address a = (Address) context.getBean("adr1");
		Employee e = (Employee) context.getBean("emp");
		System.out.println(a);
		System.out.println(e);
		
		*/
		Student s = (Student) context.getBean("stu");
		s.exams();
		System.out.println(s);
		
		/*
		Person p1 = (Person) context.getBean("person");
		System.out.println(p1.hashCode());
		
		Person p2 = (Person) context.getBean("person");
		System.out.println(p2.hashCode());
		
		*/

	}

}
