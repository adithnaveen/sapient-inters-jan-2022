package com.naveen.day7.collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); 

		set.add("Pulkit"); 
		set.add("Rahul"); 
		set.add("Nischal"); 
		set.add("Satyaa"); 
		set.add("Pulkit"); 
		set.add("Rahul"); 
		set.add("Nischal"); 
		set.add("Satyaa"); 
		
		
		System.out.println(set);
		set.remove("Pulkit"); 
		System.out.println(set);
	}
}
