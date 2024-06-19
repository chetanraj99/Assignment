package springproject.annotationsbased;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("c")
@Scope("prototype")
public class Course {
	
	int id;
	String name;
	int duration;
	
	public Course() {
		System.out.println("constructor is called");
		id=9900;
		name="B.tech";
		duration=4;
	}

	public Course(int id, String name, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", duration=" + duration + "]";
	}
	
	@PostConstruct
	public void intialization() {
		System.out.println("initialization method called...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("before destroy method is performing");
	}

}
