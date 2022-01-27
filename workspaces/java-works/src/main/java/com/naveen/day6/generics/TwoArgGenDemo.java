package com.naveen.day6.generics;

class TwoGen<T, V> {
	private T obj1;
	private V obj2;
	
	public TwoGen(T obj1, V obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public T getObj1() {
		return obj1;
	}

	public V getObj2() {
		return obj2;
	}
	
	public void showTypes() {
		System.out.println("Type of T "+ obj1.getClass().getName());
		System.out.println("Type of V "+ obj2.getClass().getName());
	}

}

public class TwoArgGenDemo {
	public static void main(String[] args) {
		TwoGen<String, Integer> twoGenObj  = new TwoGen("Hello", 100);
		twoGenObj.showTypes();
		// obtain the values 
		String strVal = twoGenObj.getObj1();
		Integer intVal = twoGenObj.getObj2();
		
		System.out.println("Str is " + strVal);
		System.out.println("Int is " + intVal);
				
	}
}















