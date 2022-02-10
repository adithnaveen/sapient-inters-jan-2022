package com.naveen;

// trying to check this progrm with jmx 

public class HelloWolrd2 {
 
	public static void main(String[] args) {
		
		for(int i=0; i<10000; i++) {
			try {
				Thread.sleep(500);
				// this could be resource intensive code 
				new String("testing"); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
}
