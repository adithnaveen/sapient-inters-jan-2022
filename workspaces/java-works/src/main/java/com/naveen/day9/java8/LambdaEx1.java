package com.naveen.day9.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaEx1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		System.out.println("------- With For Loop------");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) +"\t");
		}
		System.out.println();
		// enhnace for loop 
		System.out.println("------- With For Loop------");
		for(Integer temp : list ) {
			System.out.print(temp +"\t");
		}
		// with lambda 
		System.out.println();
		System.out.println("------- With lambda ------");
		list.forEach(( t) ->  System.out.print(t +"\t") );
		
		// method referece 
		System.out.println();
		System.out.println("------- Method Reference ------");
		list.forEach(System.out :: println);
	}
}













