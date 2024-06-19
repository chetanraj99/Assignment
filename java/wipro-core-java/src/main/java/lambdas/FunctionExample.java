package lambdas;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionExample {

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
		
		Student s1 = new Student(1001,"kumar",79,71,74);
		Student s2 = new Student(1002,"sunil",63,67,64);
		Student s3 = new Student(1003,"anil",59,57,54);
		
		Function<Integer,Integer> f1 = n -> n*n;
		Function<Integer,Integer> f2 = n -> n/2;
		Function<Integer,Integer> f3 = n ->{
				int fact=1;
				for(int i=2;i<=n;i++)
					fact=fact*i;
				return fact;
		};
		System.out.println(f1.apply(4));
		System.out.println(f1.apply(10));
		System.out.println(f2.apply(18));
		System.out.println(f2.apply(400));
		System.out.println("Facotiral of 4 is "+f3.apply(4));
		System.out.println("factorial of 6 is : "+f3.apply(6));
		
		
		

	}

}
