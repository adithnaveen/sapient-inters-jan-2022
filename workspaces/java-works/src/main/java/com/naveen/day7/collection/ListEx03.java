package com.naveen.day7.collection;

import java.util.Stack;

public class ListEx03 {
	public static void main(String[] args) {
		// last in first out (LIFO) 
		Stack<String> list = new Stack<String>(); 
		
		list.push("Sneha"); 
		list.push("Ayushi"); 
		list.push("Yashika"); 
		list.push("Sangita"); 
		
		System.out.println(list.peek());
		list.pop(); 
		System.out.println(list.peek());

		
	}
}
