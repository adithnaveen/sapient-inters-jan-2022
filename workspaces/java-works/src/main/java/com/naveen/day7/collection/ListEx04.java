package com.naveen.day7.collection;

import java.util.LinkedList;
import java.util.Queue;

public class ListEx04 {
	public static void main(String[] args) {
		// first in first out (FIFO) 
		Queue<String> list = new LinkedList<String>(); 
		list.offer("Sneha"); 
		list.offer("Ritu"); 
		list.offer("Sangita"); 
		
		System.out.println(list);
		System.out.println(list.peek());
		list.poll();
		System.out.println(list);
	}
}
