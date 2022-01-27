package com.naveen.day6.generics;

interface MinMax<T extends Comparable<T>> {
	T min(); 
	T max();
}

class MyClass <T extends Comparable<T>> implements MinMax<T> {
	private T [] vals; 
	
	public MyClass(T[] vals) {
		super();
		this.vals = vals;
	}

	@Override
	public T min() {
		T v = vals[0]; 
		for(int i=1; i<vals.length; i++) {
			if(vals[i].compareTo(v) < 0 ) {
				v = vals[i];
			}
		}
		return v;
	}

	@Override
	public T max() {
		T v = vals[0]; 
		for(int i=1; i<vals.length; i++) {
			if(vals[i].compareTo(v) > 0 ) {
				v = vals[i];
			}
		}
		return v;
	}
	
}

public class GenericInterfaceDemo {
	public static void main(String[] args) {
		Integer iNums[] = {4,2,6,8,10,32}; 
		Character chars[] = {'a', 'z', 'p', 'q', 'k'}; 
		
		MyClass<Integer> integerMc = new MyClass(iNums); 
		int minIntVal = integerMc.min(); 
		int maxIntVal = integerMc.max();
		System.out.println("Minimum Value: "+minIntVal);
		System.out.println("Maximum Value: "+maxIntVal);
		
		 
		MyClass<Character> stringMC = new MyClass(chars); 
		Character minChar = stringMC.min();
		Character maxChar = stringMC.max(); 
		System.out.println("Minimum Value: "+minChar);
		System.out.println("Maximum Value: "+maxChar);
		
		 
		
	}
}








