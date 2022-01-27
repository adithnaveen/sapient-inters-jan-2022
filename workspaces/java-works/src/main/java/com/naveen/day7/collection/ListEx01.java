package com.naveen.day7.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListEx01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		
		System.out.println("initial size : "+ list.size());
		list.add("Sneha"); 
		list.add("Ayushi"); 
		list.add("Yashika"); 
		list.add("Sangita"); 
		
		System.out.println("after adding size : "+ list.size());
		
		
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println("-----------------------");
		for(String temp:list) {
			System.out.println(temp);
		}
		list.remove(0); 
		System.out.println(list);
//		list.clear();
//		System.out.println(list);
		
		// with iterators (ctrl 2 + l ) 
		System.out.println("-------- display with iterators------------ ");
		  Iterator<String> iterator = list.iterator(); 
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Collections.sort(list);
		
		System.out.println("-----------------------");
		for(String temp:list) {
			System.out.println(temp);
		}
		
		List<String> newList = Collections.unmodifiableList(list); 
		System.out.println("-----------------------");
		for(String temp:newList) {
			System.out.println(temp);
		}
		newList.add("Something");
	}
}
