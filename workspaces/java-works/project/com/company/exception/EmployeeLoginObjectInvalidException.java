package com.company.exception;

public class EmployeeLoginObjectInvalidException extends Exception {
 
	private static final long serialVersionUID = 1L;
	private String msg; 

	public EmployeeLoginObjectInvalidException() {
		this.msg = "Employee Login Object Invalid Please Check"; 
	}

	public EmployeeLoginObjectInvalidException(String msg) {
		this.msg = msg; 
	}

	@Override
	public String toString() {
		return "EmployeeLoginObjectInvalidException [msg=" + msg + "]";
	}
	
	
	
	
}
