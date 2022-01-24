package com.naveen.day5.interfaces;

import java.util.Arrays;

public class PrimitiveSort {
	public static void main(String[] args) {
		String [] names = new String[] {"Mohit", "Vibhanshu", "Ritu", "Priya", "Abhinav"}; 
		
		for(String name: names) {
			System.out.println(name);
		}
		
		System.out.println("--------After sorting--------");
		
		Arrays.sort(names);
		for(String name: names) {
			System.out.println(name);
		}
		
	}
}
