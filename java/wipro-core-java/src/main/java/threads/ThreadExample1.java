package threads;

class MyThread1 extends Thread {
	
	@Override
	public void run() {
		System.out.println(this.getState());
		for(int i=0;i<100;i++) {
			//System.out.println(this.getState());
			System.out.println(i);
			//System.out.println(this.getState());
			try {
				//this.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("End of mythread...");
	}
	
}
public class ThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 m1 = new MyThread1();
	//	MyThread m2 = new MyThread();
		m1.start();
		System.out.println("Is Deamon-->"+m1.isDaemon());
		m1.setDaemon(true);
		System.out.println("Current Thread" +m1.currentThread());
	//	m2.run();
		System.out.println("Is Alive -->" +m1.isAlive());
		System.out.println("Thread Priority ->"+m1.getPriority());
		System.out.println("Thread Name ->"+m1.getName());
		System.out.println("Thread Id ->"+m1.getId());
		System.out.println("Thread State-> "+m1.getState());
		System.out.println("Current Thread" +m1.currentThread());
		//System.out.println("Is Alive -->" +m1.isDaemon());

		for(int i=101;i<=200;i++)
			System.out.println(i);
		System.out.println("End of main method");
		System.out.println("Current Thread" +m1.currentThread());
		System.out.println("Is Alive -->" +m1.isAlive());
		
	}

}
