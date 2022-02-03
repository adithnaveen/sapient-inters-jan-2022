package com.naveen.app;

import org.hibernate.Session;

import com.naveen.beans.Mobile;
import com.naveen.beans.Product;
import com.naveen.beans.Television;
import com.naveen.util.HibernateUtil;

public class AppInhe {
	public static void main(String[] args) {
		Product products [] = {
				new Television(34, "LCD", "1024x777", 101, "LG TV", "Fullscreen TV", 2222.0), 
				new Television(55, "led", "1024x2048", 102, "SONY TV", "Crystal Clear TV", 3500.0),
				new Mobile(103, "Apple", "iphone 12s", 1234.0, "Smart phone", "ios", "gsm"), 
				new Mobile(104, "One Plus", "android one plus", 365.7, "Smart Phone", "Android", "CDMA")
		}; 
		
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		for(Product temp : products) {
			session.save(temp); 
		}
		
		session.beginTransaction().commit(); 
		System.out.println("Saved,,, ");
	}
}
