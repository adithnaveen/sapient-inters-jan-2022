package com.naveen.singleton;

public class EagerSingleton {
	private static final EagerSingleton
		es = new EagerSingleton(); 
	
	private EagerSingleton() {
		System.out.println("Eager singleton created..");
	}
	
	public static EagerSingleton getInstance() {
		return es; 
	}
	
}
