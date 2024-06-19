package lambdas;

import java.util.function.Predicate;

public class PredicateExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> p1 = n -> n % 2 == 0;

		Predicate<Integer> p2 = n1 -> n1 > 20;

		Predicate<String> p3 = str -> str.length() > 10;

		Predicate<Integer> p4 = n -> {
			boolean isPrime = true;
			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;
		};

		System.out.println(p1.test(20)); // true
		System.out.println(p1.test(5)); // false
		System.out.println(p2.test(30)); // true
		System.out.println(p2.test(19)); // false

		System.out.println(p3.test("programming"));
		System.out.println(p3.test("hello"));
		
		System.out.println("is 5 prime number "+ p4.test(5));
		System.out.println("is 16 prime number "+ p4.test(16));
		System.out.println("is 17 prime number "+ p4.test(17));
		
		System.out.println(p2.and(p4).test(13));
		System.out.println(p2.or(p4).test(13));
		
		System.out.println(p1.negate().test(21));
		
		
	}

}
