package springproject.examples.autowire;

import org.springframework.stereotype.Component;

@Component("crime")
public class DepartmentImpl implements Department{

	@Override
	public String getWork() {
		// TODO Auto-generated method stub
		return "It is a crime buereau";
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return "Located at Delhi";
	}

}
