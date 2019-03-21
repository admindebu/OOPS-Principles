package com.youtube.techtalk;

import java.util.Date;

public class Transaction {
	
	private int txId;
	
	private double amount;
	private Date date;
	
	
	public int getTxId() {
		return txId;
	}
	public void setTxId(int txId) {
		this.txId = txId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Transaction [txId=" + txId + ", amount=" + amount + ", date=" + date + "]";
	}

}
