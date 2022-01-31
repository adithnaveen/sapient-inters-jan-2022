package com.naveen.day9.java8;

@FunctionalInterface
interface Maths {
	double operation(double val1, double val2); 
}

public class LambdaEx3 {
	public static void main(String[] args) {
		Maths add = (a, b) -> a + b;
		Maths sub = (a, b) -> a - b; 
		Maths mul = (a, b) -> a * b;
		Maths div = (a, b) -> a / b; 
		 
		System.out.println("Addition is " +   operate(100, 20, add));
		System.out.println("Substraciton is " + operate(32, 10, sub));
		System.out.println("Multiplication is "+ operate(4, 5, mul));
		System.out.println("Division is " + operate(100, 25, div));
	}
	private static double operate(double val1, double val2,Maths maths) {
		return maths.operation(val1, val2); 
	}
}
