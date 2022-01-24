package com.naveen.day5.statics;

public class Account {
	private int accId; 
	private String accName; 
	
	private static int counter=100;

	public Account(String accName) {
		this.accId = counter ++; 
		this.accName = accName;
	}

	public int getAccId() {
		return accId;
	}

	public String getAccName() {
		return accName;
	}

	public static int getCounter() {
		return counter;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accName=" + accName + "]";
	} 
	
	
	
}
