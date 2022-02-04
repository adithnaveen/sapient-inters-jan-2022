package com.naveen.builder;

public class EmployeeBuilder {
	private int empId;
	private String empName;
	private String empEmail;
	private Double empIncome;

	public EmployeeBuilder setEmpId(int empId) {
		this.empId = empId;
		// some more bl
		return this;
	}

	public EmployeeBuilder setEmpName(String empName) {
		this.empName = empName;
		return this;
	}

	public EmployeeBuilder setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
		return this;
	}

	public EmployeeBuilder setEmpIncome(Double empIncome) {
		this.empIncome = empIncome;
		return this;
	}

	public Employee build() {
		Employee emp = new Employee(empId, empName, empEmail, empIncome);
		if (this.empIncome > 1000) {
			emp.setDesignation("Manager");
			return emp;
		} else {
			emp.setDesignation("Developer");
			return emp;

		}
	}
}
