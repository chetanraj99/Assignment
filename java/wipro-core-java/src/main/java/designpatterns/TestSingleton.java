package designpatterns;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s1 = Singleton.getInstance();
		s1.showMessage();
		System.out.println(s1.hashCode());
		Singleton s2 = Singleton.getInstance();
		s2.showMessage();
		System.out.println(s2.hashCode());
		

	}

}
