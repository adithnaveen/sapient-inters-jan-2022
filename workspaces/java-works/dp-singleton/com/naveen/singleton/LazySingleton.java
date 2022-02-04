package com.naveen.singleton;

public class LazySingleton {
	private LazySingleton() {
		System.out.println("Eager Single Object Created..");
	}

	public static LazySingleton getInstance(LazySingleton es) {
		if(es == null) {
			return new LazySingleton(); 
		}
		
		return es; 
	}
}
