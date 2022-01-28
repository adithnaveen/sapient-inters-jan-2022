package com.naveen.day8.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;

class Transaction {
	public int getBalance() {
		System.out.println("In Transaction " + Thread.currentThread());
		for(int i=0; i<10000;i++) System.out.print("");
		return (int) (Math.random()*10000); 
	}
}
public class CompletableFutureExample05 {
	public static void main(String[] args) {
		
//		singleThreadedModel();
		System.out.println("------------------------------");
		Transaction transaction = new Transaction(); 
		
		completableFuture(transaction).thenAccept(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("Transaction Amount : "+ t);
			}
		}).orTimeout(3000, TimeUnit.MILLISECONDS); 
		
		
	}

	/// new thread which will be non block 
	
	public static CompletableFuture<Integer> completableFuture(Transaction transaction) {
		System.out.println("i'm in completableFuture() - " + Thread.currentThread());
		return CompletableFuture.supplyAsync(new Supplier<Integer>() {

			@Override
			public Integer get() {
				System.out.println("In Get Method " + Thread.currentThread());
				return transaction.getBalance(); 
			}
			
		});
	}
	
	private static void singleThreadedModel() {
		Transaction transaction = new Transaction(); 
		System.out.println("I'm in " + Thread.currentThread());
		display(transaction);
	}

	private static void display(Transaction transaction) {
		System.out.println(transaction.getBalance());
		System.out.println("I'm in " + Thread.currentThread());
	}
}
