package com.naveen.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.naveen.beans.Address;
import com.naveen.beans.Person;
import com.naveen.util.HibernateUtil;

public class AppOneToMany {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction(); 

		Address addressRitu1 = new Address(); 
		addressRitu1.setCity("Delhi"); 
		addressRitu1.setPin(123445);
		addressRitu1.setStreet("Some blvd");

		Address addressRitu2 = new Address(); 
		addressRitu2.setCity("Mumbai"); 
		addressRitu2.setPin(665544);
		addressRitu2.setStreet("Beautiful Streat blvd");
		
		Address addressYuv1 = new Address(); 
		addressYuv1.setCity("Kolkatta"); 
		addressYuv1.setPin(56565);
		addressYuv1.setStreet("Old Street classsy blvd");
		
		Address addressYuv2 = new Address(); 
		addressYuv2.setCity("Mysuru"); 
		addressYuv2.setPin(54780);
		addressYuv2.setStreet("Maharaja Street ");
		
		List<Address> rituAddresses = List.of(addressRitu1, addressRitu2);
		List<Address> yuvAddresses = List.of(addressYuv1, addressYuv2);
		
		Person rituPerson = new Person(); 
		rituPerson.setPName("Ritu");
		rituPerson.setAddress(rituAddresses);
		
		Person yuvPerson = new Person(); 
		yuvPerson.setPName("Yuvraj");
		yuvPerson.setAddress(yuvAddresses);
		
		session.persist(yuvPerson);
		session.persist(rituPerson);

		transaction.commit(); 
		session.close(); 
		
		System.out.println("Saved... ");
	}
}
