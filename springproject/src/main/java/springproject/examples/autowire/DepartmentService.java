package springproject.examples.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DepartmentService {
	
	@Autowired
	@Qualifier("crime")
	Department dept;
	
	/*
	public DepartmentService() {
		dept= new DepartmentImpl();
	}
	*/
	
	public String getDepartmentLocation() {
	
		
		return dept.getLocation();
	}
	
	public String getDepartmentWork() {
		
		return dept.getWork();
	}

}
