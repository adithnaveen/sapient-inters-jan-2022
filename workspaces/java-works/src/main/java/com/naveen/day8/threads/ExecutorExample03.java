package com.naveen.day8.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunner implements Runnable{

	@Override
	public void run() {
		System.out.println("In MyRunner - run()");
	}
}
// executor decouples from the implementation 
class MyBusiness implements Executor{

	@Override
	public void execute(Runnable command) {

		command.run(); 
		
	}
	
}

public class ExecutorExample03 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		executorEx();
		ExecutorService executorService = Executors.newFixedThreadPool(5); 
		executorService.submit(new Callable() {

			@Override
			public Object call() throws Exception {
				System.out.println("Some work in executor Service " + Thread.currentThread());
				return executorService;
			}
			
		});

	}

	private static void executorEx() {
		Executor executor = new MyBusiness(); 
		executor.execute(new MyRunner());
		executor.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("this is another runner - anyonymous ");
			}
		});
	}
}
