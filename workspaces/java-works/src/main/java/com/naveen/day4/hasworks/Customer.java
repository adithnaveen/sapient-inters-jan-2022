package com.naveen.day4.hasworks;

public class Customer {
	private int custId; 
	private Name name;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return custId + ", " + 
				this.name.getFirstName() + ", " + 
				this.name.getLastName(); 
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized called.. Destructor...");
	} 
	
	
	

}
	