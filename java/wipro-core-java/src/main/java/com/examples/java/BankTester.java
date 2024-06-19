package com.examples.java;

public interface BankTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC hdfc = new HDFC();
		DBS dbs = new DBS();
		SBI sbi = new SBI();
		
		hdfc.savings();
		hdfc.loans();
		hdfc.creditCards();
		hdfc.socialService();
	
		RBI.registration();
		
		dbs.savings();
		dbs.loans();
		dbs.creditCards();
		dbs.socialService();
		
		sbi.savings();
		sbi.loans();
		sbi.creditCards();
		sbi.socialService();
		
		

	}

}
