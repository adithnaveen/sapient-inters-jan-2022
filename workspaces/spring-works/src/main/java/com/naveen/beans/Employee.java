package com.naveen.beans;

public class Employee {
	private int empId; 
	private String empName; 
	private String empEmail;
	private Address address; 
	
	
	public Employee() {
		System.out.println("in constructor Employee()");
	}
	
	public Employee(int empId, String empName, String empEmail) {
		super();
		System.out.println("In parametric constructor... ");
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", address=" + address
				+ "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	} 
	
	
	public void init() {
		System.out.println("you init for employee");
	}
	
	public void destroy() {
		System.out.println("your destroy for employee... ");
	}
}

