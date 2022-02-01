package com.company.exception;

public class EmployeeNotFoundException extends Exception {
 
	private static final long serialVersionUID = 1L;
	private String msg; 
	
	public EmployeeNotFoundException() {
		this.msg = "Employee Not Found"; 
	}
	public EmployeeNotFoundException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "EmployeeNotFoundException [msg=" + msg + "]";
	}
	
	
}
