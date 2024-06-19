package lambdas;

public class MathsImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maths m = (a,b)-> a+b;
		Circle c = r -> 3.141 * r * r;
		Biggest bt = (a,b) -> b<a;
		System.out.println("The sum of 10 and 20 "+ m.add(10,20));
		System.out.println("The area of circle with r 4 is :"+c.area(4));
		System.out.println(bt.findBig(10, 50));
		


	}

}
