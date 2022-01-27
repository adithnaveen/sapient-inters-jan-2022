package com.naveen.day7.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetEx02 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(); 
		set.add("Pulkit"); 
		set.add("Rahul"); 
		set.add("Nischal"); 
		set.add("Satyaa"); 
		set.add("Pulkit"); 
		set.add("Rahul"); 
		set.add("Nischal"); 
		set.add("Satyaa"); 
		
		System.out.println(set);
	}
}
