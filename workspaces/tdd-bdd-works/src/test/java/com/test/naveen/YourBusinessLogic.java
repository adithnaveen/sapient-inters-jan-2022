package com.test.naveen;

import static org.junit.Assert.*;
 
import org.junit.Test;

import com.naveen.EmployeeService;
import com.naveen.IEmployeeService;
 
public class YourBusinessLogic {
	
	IEmployeeService service; 
	public void setUp() {
		service = new EmployeeService(); 
	}
	
	
	@Test
	public void testing() {
		assertTrue(true);
	}
	
	public void emplooyeeLoginTest() {
		String userName = "ashish@gmail.com"; 
		String password = "secret"; 
		
		 
		assertNotNull(service.getEmployee(userName, password));
	}
}
