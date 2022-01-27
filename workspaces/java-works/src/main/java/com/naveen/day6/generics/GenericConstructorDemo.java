package com.naveen.day6.generics;
// to show working of generics with constructor 
class GenericConstructor{
	private double val; 
	<T extends Number> GenericConstructor(T arg) {
		this.val = arg.doubleValue(); 
	}
	void showVal() {
		System.out.println("Val is " + val);
	}
}
public class GenericConstructorDemo {
	public static void main(String[] args) {
		GenericConstructor genCon = new GenericConstructor(100); 
		genCon.showVal(); 
		GenericConstructor genCon1 = new GenericConstructor(123.45f); 
		genCon1.showVal();
	}
}
