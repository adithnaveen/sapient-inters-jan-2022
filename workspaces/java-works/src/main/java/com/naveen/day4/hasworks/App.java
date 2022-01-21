package com.naveen.day4.hasworks;

public class App {
	public static void main(String[] args) {
		// only upto jdk 1.8, in java 11 
		// this method is taken off 
//		 Runtime.runFinalizersOnExit(true);

		Customer customer = new Customer(); 
		customer.setCustId(101);
		Name name = new Name(); 
		name.setFirstName("Roshini");
		name.setLastName("Sharma");
		customer.setName(name);
		

		System.out.println(customer);
		

	}
}
