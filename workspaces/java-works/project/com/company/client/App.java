package com.company.client;

import java.io.IOException;

import com.company.beans.EmployeeLogin;
import com.company.service.EmployeeService;
import com.company.service.IEmployeeService;

public class App {
	public static void main(String[] args) throws IOException {
		// menu driven code here 
		IEmployeeService service = new EmployeeService(); 
		
		EmployeeLogin login = new EmployeeLogin("Hello", "hi"); 
		
		boolean checkLogin = service.checkLogin(login); 
	}
}
