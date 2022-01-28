package com.naveen.day8.threads;

class MyBusinessLogic1 implements Runnable {
	
	private Thread t;
	public MyBusinessLogic1() {}
	public MyBusinessLogic1(String name, int priority) {
		t = new Thread(this, name); 
		t.setPriority(priority);
		// this will create OS Level Thread and invoke run() 
		t.start(); 
	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("I Value is " +i +" in " + Thread.currentThread());
			
		}
		System.out.println("Exiting Thread "+ Thread.currentThread());
	
	}
	
}

public class ThreadEx02 {
	public static void main(String[] args) {
		System.out.println("Start of Main ");
		
		MyBusinessLogic1 mbl1 = new MyBusinessLogic1("Styluss", 10); 
		MyBusinessLogic1 mbl2 = new MyBusinessLogic1("Charging Docker", 7); 
		
		Thread t1 = new Thread(new MyBusinessLogic1()); 
		t1.setName("Printer");
		t1.setPriority(2); 
		t1.start(); 
		
		System.out.println("End of Main ");
	}
}
