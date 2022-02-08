package com.myworks.bl;

import com.myworks.contract.IVehicle;

public class Car implements IVehicle{

	@Override
	public void move() {
		System.out.println("Car from Interface is Moving");
	}
	
	public String testMe(String carName) {
		return "hi " + carName; 
	}
}
