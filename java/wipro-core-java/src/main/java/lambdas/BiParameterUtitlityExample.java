package lambdas;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiParameterUtitlityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<Integer,Integer> p1 = (a,b)-> a<b;
		BiFunction<Integer,Integer,Integer> f1 =(a,b) -> a*b;
		BiConsumer<Integer,Integer> c1 = (a,b)->{
			System.out.println("The sum is : "+(a+b));
		};
		System.out.println(p1.test(10, 20));
		System.out.println(f1.apply(20, 10));
		c1.accept(20, 30);

	}
}
