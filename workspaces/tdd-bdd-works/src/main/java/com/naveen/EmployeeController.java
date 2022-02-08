package com.naveen;

public class EmployeeController implements IEmployeeController {
	@Override
	public Employee getEmployee(String email, String password) {
		return new Employee();
	}
}
