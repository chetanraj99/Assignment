package springproject.model;

public class Student {
	
	int htno;
	String name;
	String branch;
	public Student() {
		htno=1001;
		name="Krishna";
		branch="cse";
	}
	public Student(int htno, String name, String branch) {
		super();
		this.htno = htno;
		this.name = name;
		this.branch = branch;
	}
	public int getHtno() {
		return htno;
	}
	public void setHtno(int htno) {
		this.htno = htno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + ", branch=" + branch + "]";
	}
	
	public void exams() {
		System.out.println("Student writing the exams...");
	}
	
	public void init() {
		System.out.println("Spring bean Intialized");
	}
	
	public void destroy() {
		System.out.println("Spring bean is destroyed");
	}

}
