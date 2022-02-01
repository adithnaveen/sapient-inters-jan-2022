package com.naveen.day10.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Function;

public class StreamEx04 {
	public static void main(String[] args) throws IOException {
		Files.list(Paths.get("."))
			.map(Path :: getFileName)
			.map(Path :: toString)
			.filter(name -> name.endsWith("txt"))
			.limit(4)
			.sorted()
//			.forEach(System.out :: println);
			.map(name -> name.toUpperCase())
			.forEach(file -> myDisplayFuction(file));
		
		// calling function to test 
//		System.out.println(fnTest("Harry"));
	}
	
	private static void myDisplayFuction(String file) {
		System.out.println(file);
	}

	private static String fnTest(String name) {
		Function<String, String> function =  t -> t.toUpperCase();
		return function.apply(name); 
	}
}
