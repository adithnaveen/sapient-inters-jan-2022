package com.naveen.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naveen.beans.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new 
					ClassPathXmlApplicationContext
						("application.xml", "application2.xml"); 
		
		Employee emp = context.getBean("emp", Employee.class); 
		Employee emp1 = context.getBean("emp", Employee.class); 
		
		
		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
		
		((ClassPathXmlApplicationContext)context).close(); 
		
	}
}
