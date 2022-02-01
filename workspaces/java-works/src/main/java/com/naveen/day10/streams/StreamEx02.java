package com.naveen.day10.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamEx02 {
	public static void main(String[] args) throws IOException {
		String str = "101:naveen:1234:java,reactjs,angular:blr"; 
		Pattern pattern = Pattern.compile(":"); 
		pattern.splitAsStream(str)
			.forEach(System.out :: println);

		System.out.println("--------------");
		// to read the content from the file and process 
		Stream<String> lines = Files.lines(Paths.get("trainer.txt")); 
		lines.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				pattern.splitAsStream(t).forEach(System.out :: println);
			}
		});
		
		
		System.out.println("--------------");
		// to read the content from the file and process 
		lines = Files.lines(Paths.get("trainer.txt")); 
		lines.forEach(t ->  {
				pattern.splitAsStream(t).forEach(System.out :: println);
			 
		});
	}
}











