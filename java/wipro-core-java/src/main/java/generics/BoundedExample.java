package generics;

public class BoundedExample {
	
	public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
	
	 public static void main(String[] args) {
	        System.out.println("Sum of 3 and 4: " + add(3, 4));
	        System.out.println("Sum of 5.5 and 6.5: " + add(5.5, 6.5));
	       // System.out.println("Sum of 5.5 and 6.5: " + add("Hai", "Hello"));
	    }



}
