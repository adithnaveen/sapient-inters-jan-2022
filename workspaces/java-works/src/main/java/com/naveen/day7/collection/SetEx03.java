package com.naveen.day7.collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx03 {
	public static void main(String[] args) {
		Set<Laptop> laptops = new HashSet<Laptop>(); 
		
		laptops.add(new Laptop(101, "Apple MacBookPro", 2000.0)); 
		laptops.add(new Laptop(102, "Dell - Yoga", 2200)); 
		laptops.add(new Laptop(102, "Dell - Yoga", 2200)); 
		
		for(Laptop temp: laptops) {
			System.out.println(temp +", Stored @ " + temp.hashCode());
		}
		
	}
}
