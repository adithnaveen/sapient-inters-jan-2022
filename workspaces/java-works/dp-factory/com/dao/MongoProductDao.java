package com.dao;

import com.contracts.IProductDAO;

public class MongoProductDao implements IProductDAO{

	@Override
	public void save() {
		System.out.println("Mongo Save... ");
	}

	@Override
	public void delete() {
		System.out.println("Mongo Delete... ");
	}
	
}
