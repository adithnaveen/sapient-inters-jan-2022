package com.dao;

import com.contracts.IProductDAO;

public class HibernateProductDao  implements IProductDAO{

	@Override
	public void save() {
		System.out.println("Hibernate Save..");
		
	}

	@Override
	public void delete() {
		System.out.println("Hibernate Delete...");
	}

}
