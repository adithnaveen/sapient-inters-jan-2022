package com.naveen.singleton;

public class App1 {
	public static void main(String[] args) {
		LazySingleton es = null; 
		 
		es = LazySingleton.getInstance(es); 
		
		System.out.println("located at " + es.hashCode());
		es = LazySingleton.getInstance(es); 
		System.out.println("located at " + es.hashCode());
	}
}
