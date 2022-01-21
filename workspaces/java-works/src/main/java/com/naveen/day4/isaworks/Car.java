package com.naveen.day4.isaworks;

public class Car extends Vehicle {
	public Car() {
		System.out.println("Car is created");
	}
	
	public void fuelCapacity(int capacity) {
		System.out.println("This Car Capacity : " + capacity);
	}

	@Override
	public void move() {
		System.out.println("Car Moves With 4 Tyres");
	}
	
	
}
