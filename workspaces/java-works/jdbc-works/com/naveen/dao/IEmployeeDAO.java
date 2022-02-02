package com.naveen.dao;

import java.util.List;

import com.naveen.beans.Employee;

public interface IEmployeeDAO {
	public boolean insertEmployee(Employee employee); 
	public Employee getEmployee(int empId); 
	public boolean updateEmployee(int empId, double empSal); 
	public void deleteEmployee(int empId); 
	public List<Employee> getEmployees();
}
