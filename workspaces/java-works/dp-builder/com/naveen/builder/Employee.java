package com.naveen.builder;

public class Employee {
	private int empId; 
	private String empName; 
	private String empEmail; 
	private Double empIncome; 
	private String designation;
	public Employee() {
		
	}

	public Employee(int empId, String empName, String empEmail, Double empIncome) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empIncome = empIncome;
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

	public Double getEmpIncome() {
		return empIncome;
	}

	public void setEmpIncome(Double empIncome) {
		this.empIncome = empIncome;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empIncome="
				+ empIncome + "]";
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
}
