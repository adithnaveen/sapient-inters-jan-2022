package com.naveen.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naveen.cfg.AppConfig;
import com.naveen.dao.IEmployeeDAO;

public class AnnotationApp1 {
	public static void main(String[] args) {
		IEmployeeDAO empDao; 
		
		// an object of spring context 
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class); 
		
		empDao = context.getBean("dummyDao", IEmployeeDAO.class); 
		System.out.println("-----------------");
		System.out.println(empDao.getClass().getName() +", " + 
				empDao.getNoEmployees());
		
		
		
		// if you dont pass second object a target class then 
		// explicit casting is needed 
		IEmployeeDAO dao1 =  (IEmployeeDAO) context.getBean("jdbcDao");
		System.out.println(empDao == dao1);
		System.out.println(empDao.hashCode());
		System.out.println(dao1.hashCode());
	}
}
