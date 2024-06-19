package com.examples.java;

public interface RBI {
	
	final int roi=10; // this will become constant and it cannot be changed
	public void savings();
	void loans();
	void creditCards();
	public default void socialService() {
		//roi++;
		System.out.println("spend 0.5% of total revenue on social service");
	}
	
	public static void registration() {
		System.out.println("Registraion of banks is done to govt");
	}

}


