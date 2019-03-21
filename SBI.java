package com.youtube.techtalk;

public class SBI implements Bank{
	
	private Transaction transaction;
	
	
	public Transaction getTransaction() {
		return transaction;
	}



	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	

	@Override
	public void doTransaction() {
		
		
	}
	
	// OverLoading
	public void doTransaction(String txnType) {
		
		System.out.println("Transaction Type : " + txnType);
	}


	
}
