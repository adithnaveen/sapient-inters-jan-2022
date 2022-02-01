package com.company.service;

import java.io.IOException;

import com.company.beans.EmployeeLogin;
import com.company.dao.EmployeeDAO;
import com.company.dao.IEmployeeDAO;
import com.company.exception.EmployeeLoginObjectInvalidException;

import static com.company.uitl.EmployeeUtil.isValid;

public class EmployeeService  implements IEmployeeService{
	private IEmployeeDAO empDao = null;
	
	public EmployeeService() throws  IOException {
		this.empDao = new EmployeeDAO(); 
	}
	@Override
	public boolean checkLogin(EmployeeLogin login) {
		
		try {
			// validate employeeLogin Object 
			if(isValid(login)) {
				return empDao.login(login);
			}else {
				throw new EmployeeLoginObjectInvalidException("Sorry Invalid Object");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			
		}
		
		return false;
	}
	
	
}

