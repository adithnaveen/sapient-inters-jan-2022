package com.naveen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class HelloWolrd {
	public String sayHi() {
		return "Hello"; 
	}
	 
	public void hello() {
		System.out.println("Hello");
		 
	}
	
	
	static Logger logger = LoggerFactory.getLogger(HelloWolrd.class); 
	
	
	public static void main(String[] args) {
		new String("hi"); 
		new HelloWolrd().hello();
		logger.info("hello info");
		logger.debug("hello debug");
		
	}
}
