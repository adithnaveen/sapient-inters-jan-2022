package com.naveen.day9.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx01 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("keyboard", "pen", "mobile", "fan"); 
		List<Integer> numList = Arrays.asList(34,5,66,12,88,100,23);
		
		Predicate<Integer> intTest = t -> t > 50;
		Predicate<String> strTestGr4Chars = t -> t.length()>4;
		
		
		List<Integer> filterIntList = numList.stream().filter(intTest).collect(Collectors.toList());
		
		filterIntList.forEach(System.out :: println);
		
		// TODO 
		
	}
}
