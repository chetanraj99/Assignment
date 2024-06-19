package lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mathematics m = new Mathematics();
		
		Function<Integer,Double> f1 = m::calArea;
		BiFunction<Integer,Integer,Integer> f2 = Mathematics::add;
		
		System.out.println(f1.apply(4));
		System.out.println(f2.apply(10, 20));

	}

}
