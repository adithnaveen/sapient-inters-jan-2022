package com.naveen.day6.generics;

class Emp {}
class Gen<T> {
	// object of Type T 
	private T obj;

	public Gen(T obj) {
		super();
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	} 
	
	void showType() {
		System.out.println("Type of T is " + obj.getClass().getName());
	}
}

public class GenDemo {
	public static void main(String[] args) {
		 Gen<String> genString = new Gen("String"); 
		 Gen<Integer> genInteger = new Gen(12);
		 Gen<Emp> genEmployee = new Gen(new Emp()); 
		 
		 System.out.println(genString.getObj());
		 genString.showType(); 
		 
		 System.out.println(genInteger.getObj());
		 genInteger.showType(); 
		 
		 System.out.println(genEmployee.getObj());
		 genEmployee.showType();
		 
		 
		
	}
}
