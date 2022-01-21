package com.naveen.day4;

public class Employee {
	
	// member variables 
	// instance variables 
	
	// to access private variable, you should 
	// have different scoping 
	private int empId; 
	private String empName; 
	private double empSalary; 
	
	// if you dont have the consructor 
	// then java will give you 
	// default constructor () 
	public Employee() {
		System.out.println("You created Object");
	}
	
	// getters and setters 
	public void setEmpId(int id) {
		if(id < 1) {
			empId = 10000; 
		}else  {
			empId = id;
		}
	} 
	
	public int getEmpId() {
		return empId; 
	}
	
	
	
	public void display() {
		System.out.println("Emp Id " + empId);
		System.out.println("Emp Name " + empName);
		System.out.println("Emp Salary " + empSalary);
	}
	
	
	
	
	
}
