package com.naveen.day10.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorsEx01 {
	public static void main(String[] args) {
		List<Office> offices = List.of(
				new Office("Sapient", "India"), 
				new Office("Sapient", "UK"), 
				new Office("Infosys", "India"), 
				new Office("Infosys", "USA"), 
				new Office("Infosys", "UK"), 
				new Office("Apple", "India"), 
				new Office("Apple", "Germeny") 
			);
		
	
		Map<String, Long> counting = offices.stream().collect(
				Collectors.groupingBy(Office :: getName, Collectors.counting())
				); 
		
		System.out.println(counting);

		Map<String, Long> counting1 = offices.stream().collect(
				Collectors.groupingBy(Office :: getCountry, Collectors.counting())
				); 
		System.out.println(counting1);
		
		counting1.forEach((k, v) -> System.out.println("key "+ k +", val "+ v));
		
		
		List<Integer> list = new ArrayList<Integer>(); 
		IntStream.range(0, 20).forEach(System.out :: println);
		
		
//		IntStream.range(10, 20).forEach( i -> list.add(i));
		IntStream.rangeClosed(10, 20).forEach( i -> list.add(i));
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
