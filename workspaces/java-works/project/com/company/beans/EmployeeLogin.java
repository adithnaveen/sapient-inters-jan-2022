package com.company.beans;

/**
 * 
 * @author naveenkumar
 * @see used for login with employee 
 */
public class EmployeeLogin {
	private String userName; 
	private String password;
	
	public EmployeeLogin() {}
	public EmployeeLogin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmployeeLogin [userName=" + userName + ", password=" + password + "]";
	} 
	
}
