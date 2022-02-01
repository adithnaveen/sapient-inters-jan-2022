package com.naveen.day10.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

// to read the data fromt the file with java 1.8 
public class StreamEx01 {
	public static void main(String[] args) throws IOException {
		try (
				FileReader fr = new FileReader("trainer.txt"); 
				BufferedReader br = new BufferedReader(fr); 
				){
			br.lines().forEach(System.out :: println);
		}
		
		// with java 1.8 with streams directly
		System.out.println("------------------------ ");
		try(Stream<String> st =  Files.lines(Paths.get("trainer.txt"))){
			
			st.forEach(s -> {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(s);
			});
		}
	}
}
