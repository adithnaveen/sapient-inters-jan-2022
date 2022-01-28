package com.naveen.day8.threads;

class SomeBusinessLogic extends Thread {
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("I Value is " +i +" in " + Thread.currentThread());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exiting Thread "+ Thread.currentThread());
	}
}

public class ThreadEx01 {
	public static void main(String[] args) {
		System.out.println("The current Thread is : " + Thread.currentThread().getName());
		// Default 5, Min 1, Max 10 
		System.out.println("Priority of Thread is : " + Thread.currentThread().getPriority());
		System.out.println("Thread Group : "+ Thread.currentThread().getThreadGroup().getName());
		System.out.println("Thread Information : " + Thread.currentThread());
		
		SomeBusinessLogic logic = new SomeBusinessLogic();
		// this will create OS Level thread and invokes run() method in the class 
		logic.setPriority(Thread.MAX_PRIORITY);
		logic.setName("Pen");
		logic.start();
		
		SomeBusinessLogic logic1 = new SomeBusinessLogic();
		logic1.setName("Pencil");
		logic1.start(); 
		
		
		
		for(int i=0; i<100; i++) {
			System.out.println("I Value is " +i +" in " + Thread.currentThread());
		}
		
		
		try {
			logic.join();
			logic1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		System.out.println("Hey i'm exiting Main Thread... ");
	}
}
