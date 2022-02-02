package com.naveen.client;

import com.naveen.beans.Employee;
import com.naveen.dao.EmployeeDAO;
import com.naveen.dao.IEmployeeDAO;

public class App {
	public static void main(String[] args) {
		IEmployeeDAO dao = new EmployeeDAO(); 
		
//		Employee employee = new Employee(); 
//		
//		employee.setEmpId(145);
//		employee.setEmpName("Ashish");
//		employee.setEmpSal(2525);
//		employee.setEmpEmail("ashish@gmail.com");
//		
//		System.out.println(dao.insertEmployee(employee)?"Insert" :"Not Inserted"); 
		
//		System.out.println(dao.getEmployee(103));
//		dao.deleteEmployee(145);
		
//		dao.updateEmployee(145, 5252);
		
		dao.getEmployees().forEach(System.out :: println);
	}
}
