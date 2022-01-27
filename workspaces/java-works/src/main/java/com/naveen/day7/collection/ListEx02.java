package com.naveen.day7.collection;

import java.util.Vector;

// vector class has capacity and methods under this class
// are synchcronized / thread safe 
public class ListEx02 {
	public static void main(String[] args) {
		Vector<String> list = new Vector<String>(4, 3);
		
		System.out.println("Initial size : "+ list.size());
		System.out.println("Cappacity " + list.capacity());
		
		list.add("Sneha"); 
		list.add("Ayushi"); 
		list.add("Yashika"); 
		list.add("Sangita");
	 
		list.add("Ritu"); 
		list.add("Ritu");
		list.add("Ritu");
		
		list.add("Sangita");

		System.out.println("Initial size : "+ list.size());
		System.out.println("Cappacity " + list.capacity());
		
	}
}
