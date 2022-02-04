package com.impl;

import com.contracts.IProductDAO;
import com.factory.DaoFactory;

public class App {
	public static void main(String[] args) {
		IProductDAO productDao = DaoFactory.getProductDao();
		
		productDao.save(); 
		productDao.delete(); 
	}
}
