package com.naveen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class HelloWolrd {
	public String sayHi() {
		return "Hello"; 
	}
	
	
	Logger logger = LoggerFactory.getLogger(HelloWolrd.class); 
	
	public void hello() {
		System.out.println("Hello");
		
		logger.debug("hi i'm from logger debug");
		
	}
	
	public static void main(String[] args) {
		new HelloWolrd().hello();
	}
}
