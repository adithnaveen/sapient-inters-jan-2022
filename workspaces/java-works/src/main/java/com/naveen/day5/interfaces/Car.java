package com.naveen.day5.interfaces;

public class Car implements IVehicle{

	@Override
	public void move() {
		System.out.println("Car from Interface is Moving");
	}

}
