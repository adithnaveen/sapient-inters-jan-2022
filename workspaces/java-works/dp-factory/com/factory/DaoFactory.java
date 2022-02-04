package com.factory;

import java.util.ResourceBundle;

import com.contracts.IProductDAO;
import com.dao.HibernateProductDao;
import com.dao.JdbcProductDao;
import com.dao.MongoProductDao;

public final class DaoFactory {
	private DaoFactory() {
	}
	
	public static IProductDAO getProductDao() {
		ResourceBundle bundle = ResourceBundle.getBundle("application");
		String dbSelect = bundle.getString("productDao.impl"); 
		return getProductDao(dbSelect); 
	}

	private static IProductDAO getProductDao(String dbSelect) {
		System.out.println("Db Selected " + dbSelect);
		switch (dbSelect.toLowerCase()) {
			case "jdbc":
				return new JdbcProductDao(); 
			case "mongo":
				return new MongoProductDao(); 
				
			case "hibernate":
				return new HibernateProductDao(); 
			default:
				throw new RuntimeException("Wrong Database selected"); 
		}
		
	}
	
}
