package com.naveen.day4;

public class App {
	

	
	public static void main(String[] args) {
		Employee emp  = null; 
		emp = new Employee(); 
		emp.setEmpId(101);
		emp.setEmpName("Naveen");
		emp.setEmpSalary(2323);
		emp.setEmpEmail("naveen@probits.in");

		emp.display(); 
		
	}
	
}
