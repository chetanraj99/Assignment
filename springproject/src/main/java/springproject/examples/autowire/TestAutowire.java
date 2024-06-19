package springproject.examples.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springproject.javabased.BeanConfigurations;

public class TestAutowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DeptConfiguration.class);
		DepartmentService service = context.getBean(DepartmentService.class);
		
		System.out.println(service.getDepartmentWork());
		System.out.println(service.getDepartmentLocation());
	}

}
