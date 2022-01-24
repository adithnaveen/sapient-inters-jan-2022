package com.naveen.day5.statics;

public class StaticEx01 {
	
	static int counter=100; 
	
	// access-spcefier access-modifier return/void method-name(signature)
	public static int add(int a, int b) {
		return a + b; 
	} 
	
	//after constructor call 
	{
		System.out.println("Hey i'm in instance block ");
	}
	static {
		System.out.println("This is first static block ");
		System.out.println("Counter is " + counter);
	}
	
	public static void main(String[] args) {
		new StaticEx01(); 
		int result =  add(10, 20);
		System.out.println("Result " + result);
	}
	

	static {
		System.out.println("This is second static block ");
	}
	
}
