package com.naveen.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.naveen.beans.Employee;

public class HibernateUtil {
	static SessionFactory sessionFactory = null; 
	
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		
		configuration.addAnnotatedClass(Employee.class); 

		ServiceRegistry serviceRegistry = 
				new StandardServiceRegistryBuilder().
					applySettings(configuration.getProperties()).build();
		
		return configuration.buildSessionFactory(serviceRegistry);
	}
}
