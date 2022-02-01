package com.naveen.day10.streams;

import java.util.List;

public class StreamEx05 {
	public static void main(String[] args) {
		List<Trainer> list = List.of(
				new Trainer(123, "Naveen", 1223), 
				new Trainer(456, "Vinod", 5645), 
				new Trainer(12, "Vibha", 1122), 
				new Trainer(13, "Navneeth", 3322), 
				new Trainer(23, "Becky", 5566) 
				); 
		
		list.stream()
			.map(Trainer :: gettName)
			.map(name -> name.toUpperCase())
			.sorted((a,b) -> a.compareTo(b))
			.limit(4)
			.forEach(System.out :: println);
	}
}
