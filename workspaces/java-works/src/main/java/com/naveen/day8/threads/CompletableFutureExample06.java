package com.naveen.day8.threads;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CompletableFutureExample06 {
	static List<String> list = List.of("Chetan", "Ayushi", "Yashika", "Gurpreet"); 
	
	public static void main(String[] args) {
		getNames()
			.thenApply(new Function<List<String>, List<String>>() {

				@Override
				public List<String> apply(List<String> t) {
					
					return t.subList(0, 3);
				}
				
			})
			.thenApply(new Function<List<String>, List<String>>() {

				@Override
				public List<String> apply(List<String> t) {
					return t.stream().sorted().collect(Collectors.toList());
				}
				
			})
			.thenApply(new Function<List<String>,  String >() {

				@Override
				public  String  apply(List<String> t) {
					return t.toString().toUpperCase();
				}
				
			})
			.thenAccept(new Consumer<String>() {

				@Override
				public void accept(String t) {
					System.out.println(t);
				}
				
			});
			
	}
	
	
	private static CompletableFuture<List<String>> getNames(){
		return CompletableFuture.supplyAsync(new Supplier<List<String>>() {

			@Override
			public List<String> get() {
				System.out.println("Thread 1 "+ Thread.currentThread());
				return list; 
			}
			
		});
	}
	
}
