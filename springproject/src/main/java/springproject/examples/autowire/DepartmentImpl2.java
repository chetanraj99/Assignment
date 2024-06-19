package springproject.examples.autowire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("fire")
@Primary
public class DepartmentImpl2 implements Department {

	@Override
	public String getWork() {
		// TODO Auto-generated method stub
		return "It is a Fire Service";
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return "Located at Mumbai";
	}

}
