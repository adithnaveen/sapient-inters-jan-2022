package com.naveen.builder;

public class Client {
	public static void main(String[] args) {
		Employee employee = new Employee(101, "Kushal", "kushal@gmail.com", 1234.0);
		Employee employee1 = new EmployeeBuilder()
					.setEmpId(101)
					.setEmpName("Kushal")
					.setEmpEmail("Kushal@gmail.com")
					.setEmpIncome(1234.0)
					.build(); 
					
					
	}
}
