package com.company.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.company.beans.Employee;
import com.company.beans.EmployeeLogin;
import com.company.beans.EmployeeRegistration;

public class EmployeeDAO implements IEmployeeDAO {

	private ObjectOutputStream oos = null; 
	private ObjectInputStream ois = null; 
	public EmployeeDAO() throws FileNotFoundException, IOException {
		oos = new ObjectOutputStream(new FileOutputStream("emmployee.ser"));
		ois = new ObjectInputStream(new FileInputStream("employee.ser")); 
	}
	
	@Override
	public boolean login(EmployeeLogin login) throws ClassNotFoundException, IOException {
		List<EmployeeLogin> employeeList = (List<EmployeeLogin>) ois.readObject(); 
		// check in the list if the employee which you are looking is there 
		return false;
	}

	@Override
	public boolean register(EmployeeRegistration register) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeLogin getEmployeeLogin(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getListOfTechnologies(String userName) {
		// i'm planning to work here Mr. Ashish 
		return null;
	}

}
