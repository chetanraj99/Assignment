package lambdas;

import java.util.function.Consumer;
import java.util.function.Function;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Student> c1 = s -> {
			System.out.println("Student hallticket : "+s.getHtno());
			System.out.println("Name of Student : "+s.getName());
			System.out.println("Subject-1 : "+s.getM1());
			System.out.println("Subject-2 : "+s.getM2());
			System.out.println("Subject-3 : "+s.getM3());
			System.out.println("Total : "+s.getTotal());
			System.out.println("Average : "+s.getAvgr());
			System.out.println("Result : "+s.getResult());
			
		};
		
		Function<Student, Student> f = s -> {
			s.total = s.m1 + s.m2 + s.m3;
			s.avgr = s.total / 3;
			if (s.avgr >= 70)
				s.result = "Distinction";
			else if (s.avgr >= 60 && s.avgr < 70)
				s.result = "First class";
			else if (s.avgr >= 50 && s.avgr < 60)
				s.result = "Second Class";
			else
				s.result = "Fail";

			return s;
		};
		
	Student s1 = new Student(1001,"kumar",79,71,74);
	Student s2 = new Student(1002,"sunil",63,67,64);
	Student s3 = new Student(1003,"anil",59,57,54);
	
	c1.accept(f.apply(s1));
	c1.accept(f.apply(s2));
	c1.accept(f.apply(s3));
	

	

	}

}
