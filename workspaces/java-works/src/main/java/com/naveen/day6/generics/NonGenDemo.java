package com.naveen.day6.generics;


class NonGen {
	private Object obj; // obj is the type of object 

	public NonGen(Object obj) {
		super();
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}
	
	void showType() {
		System.out.println("Type of obj : " + obj.getClass().getName());
	}
}
public class NonGenDemo {
	public static void main(String[] args) {
		// java does implicit autoboxing 
		NonGen obj1 = new NonGen(100);
		
		obj1.showType();
		
		int valInteger = (Integer) obj1.getObj();
		System.out.println("Val is " + valInteger);
		
		NonGen obj2 = new NonGen("Hello"); 
		obj2.showType();
		String valString =  (String) obj2.getObj();
		System.out.println("Val of String : " + valString);
		
		// at compile time it works but conceptutally its wrong 
		obj1 = obj2; 
		valInteger = (Integer) obj1.getObj(); // run time problem 
		Double valDouble = (Double) obj1.getObj(); // run time problem
	}
}






