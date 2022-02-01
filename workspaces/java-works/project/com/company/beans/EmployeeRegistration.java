package com.company.beans;

/**
 * 
 * @author naveenkumar
 * @see is used at the time of employee registration
 */
public class EmployeeRegistration {
	private String userName; 
	private String password; 
	private String confirmPassword; 
	private Double income;
	
	 
	public EmployeeRegistration() { }
	public EmployeeRegistration(String userName, String password, String confirmPassword, Double income) {
		super();
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.income = income;
	}
	@Override
	public String toString() {
		return "EmployeeRegistration [userName=" + userName + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", income=" + income + "]";
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public Double getIncome() {
		return income;
	}
	public void setIncome(Double income) {
		this.income = income;
	} 
	
	
}
