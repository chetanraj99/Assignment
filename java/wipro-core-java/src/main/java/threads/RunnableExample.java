package threads;
// below class is used without lambda expressions
class Mythread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
			System.out.println(i);
		
	}
	
}


public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mythread m = new Mythread();
		
		// below code uses lambda expression with out using the intermediate
		// class for run method implementation
		
		Runnable r = () -> {
			for(int i=1;i<=100;i++) 
				System.out.println(i);
		};
		Thread t = new Thread(r);
		t.start();
		
		for(int i=101;i<=200;i++)
			System.out.println(i);
		System.out.println("End of main method");
		

	}

}
