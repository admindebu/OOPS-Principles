package com.youtube.techtalk;

public class HDFC implements Bank {

	private Transaction transaction;
	
	
	public Transaction getTransaction() {
		return transaction;
	}



	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	

	@Override
	public void doTransaction() {
		System.out.println("Transaction  : " + transaction);
		
	}
	
	// OverLoading
	public void doTransaction(String txnType) {
		
		System.out.println("Transaction Type : " + txnType);
	}


}
