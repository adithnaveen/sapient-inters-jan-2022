package com.naveen.day9.java8;


// a functional interface shall have exactly 1 function 

@FunctionalInterface
interface Executable {
	int execute(int a, int b); 
}

interface StringExeuctable {
	String execute(String a, String b); 
}

class Runner {
	public void run(Executable e) {
		System.out.println("In run()..");
		int val1 = 100; 
		int val2 = 200; 
		int result = e.execute(val1, val2);
		System.out.println("Result " + result );
	}
	public void run(Executable e, int val1, int val2) {
		System.out.println("In run()..");
		 
		int result = e.execute(val1, val2);
		System.out.println("Result " + result );
	}
	
	public void run(StringExeuctable ex, String str1, String str2) {
		System.out.println(ex.execute(str1, str2));
	}
}

public class LambdaEx2 {
	public static void main(String[] args) {
		Runner runner = new Runner(); 
		// version 1 
		runner.run(new Executable() {
			
			@Override
			public int execute(int a, int b) {
				return a + b; 
			}
		});
		// version 2
		runner.run((a,  b) -> a* b, 20, 20);
		
		// version 3 
		Executable substractionExecutable = (a, b) -> a-b; 
		runner.run(substractionExecutable, 200, 100);
		
		
		// with String operation 
		
		runner.run((String str1, String str2) -> str1.concat(str2), "Pulkit ", "Joshi");
	}
}







