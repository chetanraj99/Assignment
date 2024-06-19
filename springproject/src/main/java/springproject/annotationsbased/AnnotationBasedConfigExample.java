package springproject.annotationsbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springproject.model.Employee;

public class AnnotationBasedConfigExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(EntityConfigurations.class);

//	Book book = context.getBean(Book.class);
	Book book = (Book) context.getBean("b");
	
	//Course course = context.getBean(Course.class);
	Course course = (Course) context.getBean("c");
	
	
	
	Employee emp = context.getBean(Employee.class);
	System.out.println(book);
	System.out.println(course);
	System.out.println(emp);
	
	}

}
