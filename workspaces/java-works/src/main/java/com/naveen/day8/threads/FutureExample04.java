package com.naveen.day8.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureExample04 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor(); 
		
		Future<String> future = es.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				Thread.sleep(5000);
				return "Completed!!!";
			}
		});
		
		try {
			while(!future.isDone()) {
				System.out.println("Still working please wait.. ");
				Thread.sleep(500);
			}
			
			System.out.println("Task Completed... ");
			String result = future.get(3000, TimeUnit.MILLISECONDS); 
			System.out.println("Result : " + result );
			es.shutdown(); 
		}catch(Exception e) {
			future.cancel(true); 
			future.isDone(); 
			future.isCancelled(); 
		}
	}
}
