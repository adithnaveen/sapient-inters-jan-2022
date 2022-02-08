package com.myworks.bl;

import com.myworks.contract.IVehicle;

public class Lorry implements IVehicle {

	@Override
	public void move() {
		System.out.println("You are driving a lorry");
	}

}
