package com.dao;

import com.contracts.IProductDAO;

public class JdbcProductDao implements IProductDAO {

	@Override
	public void save() {
		System.out.println("jdbc Save");
	}

	@Override
	public void delete() {
		System.out.println("jdbc delete");
	}

}
