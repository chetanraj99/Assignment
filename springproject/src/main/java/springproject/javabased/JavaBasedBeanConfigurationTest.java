package springproject.javabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import springproject.model.Address;
import springproject.model.Employee;
import springproject.model.Person;

public class JavaBasedBeanConfigurationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(BeanConfigurations.class);
		
		//Person p = context.getBean(Person.class);
		//System.out.println(p);
		
		Address a1= (Address) context.getBean(Address.class);
		//Address a2= (Address) context.getBean("adr1");
		System.out.println(a1);
		//System.out.println(a2.hashCode());
		
		//Employee e = context.getBean(Employee.class);
		//System.out.println(e);

	}

}
