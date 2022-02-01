package com.company.dao;

import java.io.IOException;

import com.company.beans.Employee;
import com.company.beans.EmployeeLogin;
import com.company.beans.EmployeeRegistration;

public interface IEmployeeDAO {
	public boolean login(EmployeeLogin login) throws ClassNotFoundException, IOException; 
	public boolean register(EmployeeRegistration register); 
	public EmployeeLogin getEmployeeLogin(String userName); 
	public Employee getListOfTechnologies(String userName); 
}
