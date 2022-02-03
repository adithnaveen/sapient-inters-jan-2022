package com.naveen.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.naveen.beans.Employee;

import static com.naveen.util.HibernateUtil.getSessionFactory;

public class App {
	public static void main(String[] args) {
		Session session = getSessionFactory().openSession(); 
		Transaction transaction = session.beginTransaction(); 
		
		
		Employee employee = new Employee(); 
		employee.setEmpId(103);
		employee.setEmpName("Priya");
		employee.setEmpSal(2525.0);
		
		// you are only giving emp object to hibernate
		session.save(employee); 
		// the save to db will happen here 
		session.getTransaction().commit();
		System.out.println("Record Saved..");
	}
}
