package springproject.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//import springproject.model.Address;
import springproject.model.Employee;
import springproject.model.Person;

@Configuration
public class BeanConfigurations {
	/*
	@Bean(name="adr1")
	@Scope("prototype")
	public Address createAddress1() {
		return new Address(1111,"MG Road", "Bangalore");
	}
	*/
	
	@Bean
	public Address createAddress2() {
		return new Address(2222,"SP Road", "Hyderabad");
	}
	
	@Bean
	public Employee createEmployee() {
		return new Employee();
	}
	/*
	@Bean
	public Person createPerson() {
		return new Person(999,"Kumar",createAddress2());
	}
*/
}
