package com.naveen;

public class EmployeeService implements IEmployeeService {
	private IEmployeeController controller;

	public EmployeeService() {
		controller = new EmployeeController();
	}
	
	@Override
	public Employee getEmployee(String email, String password) {
		return controller.getEmployee(email, password);
	}
}
