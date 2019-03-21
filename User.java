package com.youtube.techtalk;

import java.util.Date;

public class User {
	
	public static void main(String[] args) {
		
		Bank bank  = new SBI();
		SBI sbi = new SBI();  
		Transaction transaction = new Transaction();
		transaction.setTxId(12);
		transaction.setAmount(100.50);
		transaction.setDate(new Date());
		
		sbi.setTransaction(transaction);
		bank.doTransaction();
		//- direct access no abstraction
		//sbi.doTransaction();
		// compile time polymorphism
		sbi.doTransaction("WithDraw");
		
		
		
	}

}
