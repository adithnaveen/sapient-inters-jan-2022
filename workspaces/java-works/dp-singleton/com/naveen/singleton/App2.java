package com.naveen.singleton;

public class App2 {
	public static void main(String[] args) {
		EagerSingleton es = EagerSingleton.getInstance(); 
		System.out.println(es.hashCode());

		es = EagerSingleton.getInstance(); 
		System.out.println(es.hashCode());
		
		es = EagerSingleton.getInstance(); 
		System.out.println(es.hashCode());
		
		es = EagerSingleton.getInstance(); 
		System.out.println(es.hashCode());
		
		es = EagerSingleton.getInstance(); 
		System.out.println(es.hashCode());
		 
	}
}
