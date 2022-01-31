package com.naveen.day9.java8;

@FunctionalInterface
interface SomeFunctionInterface {
	public void hi();
	public default void bye() {
		System.out.println("This is default in Interface");
	}
	public default void cya() {
		System.out.println("hey i'm in CYA");
	}
	
	public static void someStatic() {
		System.out.println("Hey i'm some static method in interface");
	}
}
/// dummy class to show working of a class reutring object of another 

class Something {
	private int val1; 
	private int val2; 
	
	public Something doSomething(int val1) {
		this.val1 = val1; 
		return this; 
	}
	
}
public class DefaultEx01 {

}
