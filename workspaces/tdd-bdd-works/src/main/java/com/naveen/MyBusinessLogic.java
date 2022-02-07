package com.naveen;

public class MyBusinessLogic {
	public String sayHi(String name) {
		return "hi " + name; 
	}
	
	public boolean insertEmployee(Employee employee) {
		return true; 
	}
	
	public String getSomething() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return "something"; 
	}
	
	public Employee getEmployee(int empId) {
		if(empId==100) {
			return new Employee();
		}else {
			throw new RuntimeException(); 
		}
		
	}
}
