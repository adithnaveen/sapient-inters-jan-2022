package com.naveen.day4;


// if the class has default constructor / parametric constructor 
// and getters and setters 
// then the class is called as java bean 

public class Employee {
	
	// member variables 
	// instance variables 
	
	// to access private variable, you should 
	// have different scoping 
	private int empId; 
	private String empName; 
	private double empSalary; 
	private String empEmail; 
	
	// if you dont have the consructor 
	// then java will give you 
	// default constructor () 
	public Employee() {
		System.out.println("You created Object");
	}
	public int getEmpId() {
		return empId;
	}

	// throw some exception 
	public void setEmpId(int empId) {
		this.empId = empId< 1 ? 10000 : empId;
	}

	public String getEmpName() {
		return empName;
	}

	// name too short 
	public void setEmpName(String empName) {
		this.empName = empName.length()<6 ? "No Name" : empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary<1000 ? 1000 : empSalary; 
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public void display() {
		System.out.println("Emp Id " + empId);
		System.out.println("Emp Name " + empName);
		System.out.println("Emp Salary " + empSalary);
	}
	
	
	
	
	
}
