package lambdas;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1001,"kumar",79,71,74);
		Student s2 = new Student(1002,"sunil",63,67,64);
		Student s3 = new Student(1003,"anil",59,57,54);
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
		Consumer<Integer> c = n -> {
			System.out.println("The square of n is "+ n*n);
			System.out.println("The half of n is "+n/2);
			
			
		};
		
		c.accept(10);
		
		c1.accept(s1);
		c1.accept(s2);
		c1.accept(s3);

	}

}
