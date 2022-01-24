package com.naveen.day4.exception;

public class NameTooShortException extends Exception {
	

	private static final long serialVersionUID = 1L;
	
	private String msg; 
	
	public NameTooShortException() {
		this.msg = "Sorry Name Too Short"; 
	}
	public NameTooShortException(String msg) {
		this.msg = msg; 
	}
	
	@Override
	public String toString() {
		return "NameTooShortException [msg=" + msg + "]";
	}
	
	@Override
	public String getMessage() {
		return "MESSAGE: "+ msg;
	}
}
