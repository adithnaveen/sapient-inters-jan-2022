package com.naveen;

public class EmployeeService {
	private EmployeeController controller;

	public EmployeeService() {
		controller = new EmployeeController();
	}
	
	public Employee getEmployee(String email, String password) {
		return controller.getEmployee(email, password);
	}
}
