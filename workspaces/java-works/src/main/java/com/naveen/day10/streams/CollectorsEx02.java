package com.naveen.day10.streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsEx02 {
	public static void main(String[] args) {
		List<Product> list = List.of(

				new Product("laptop", 10, 1500.00), 
				new Product("laptop", 23, 1200.00), 
				new Product("mouse", 10, 45.00), 
				new Product("mouse", 56, 9.00), 
				new Product("keyboard", 3, 78.00), 
				new Product("keyboard", 3, 78.00), 
				new Product("keyboard", 3, 78.00), 
				new Product("keyboard", 3, 78.00), 
				new Product("adapter", 10, 65.00)
				);
		
		Map<String, Integer> sumOfProducts = list.stream().collect(Collectors.groupingBy
				(Product :: getName, Collectors.summingInt(Product :: getQty))); 
		
		System.out.println(sumOfProducts);
		
		// group products by qty 
		Map<Integer, List<Product>> groupByQty = list.stream().collect(Collectors.groupingBy(Product :: getQty));
		System.out.println(groupByQty);
		
		System.out.println("--------------------");
		System.out.println(groupByQty.get(10)); 
		
		
		System.out.println("--------------------");

		for(Product temp : groupByQty.get(10)) {
			System.out.println(temp);
		}
		
		// group by product with uniq products 
		
		    Map<Double, Set<String>> collect = 
		    		list.
		    		stream().
					collect(Collectors.groupingBy(Product :: getPrice, 
							Collectors.mapping(Product :: getName, Collectors.toSet()))); 

		System.out.println("------==========--------------");
		
		System.out.println(collect);
		
		
		
		IntSummaryStatistics statistics = list.stream().mapToInt(x -> x.getQty()).summaryStatistics(); 
		
		System.out.println("Average : "+ statistics.getAverage());
		System.out.println("Sum " + statistics.getSum());
		System.out.println("Min " + statistics.getMin());
		
	}
}
