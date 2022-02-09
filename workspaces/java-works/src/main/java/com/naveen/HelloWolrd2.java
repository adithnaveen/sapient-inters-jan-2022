package com.naveen;

import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// trying to check this progrm with jmx 

public class HelloWolrd2 {
 
	public static void main(String[] args) {
		
		for(int i=0; i<1000; i++) {
			try {
				Thread.sleep(1000);
				new String("testing"); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
}
