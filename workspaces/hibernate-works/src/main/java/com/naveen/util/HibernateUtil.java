package com.naveen.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.naveen.beans.Address;
import com.naveen.beans.Employee;
import com.naveen.beans.Mobile;
import com.naveen.beans.Person;
import com.naveen.beans.Product;
import com.naveen.beans.Television;

public class HibernateUtil {
	static SessionFactory sessionFactory = null; 
	private HibernateUtil() {}
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		
		configuration.addAnnotatedClass(Employee.class); 
//		configuration.addAnnotatedClass(Product.class); 
//		configuration.addAnnotatedClass(Television.class); 
//		configuration.addAnnotatedClass(Mobile.class); 
		
//		configuration.addAnnotatedClass(Person.class); 
//		configuration.addAnnotatedClass(Address.class); 

		ServiceRegistry serviceRegistry = 
				new StandardServiceRegistryBuilder().
					applySettings(configuration.getProperties()).build();
		
		return configuration.buildSessionFactory(serviceRegistry);
	}
}
