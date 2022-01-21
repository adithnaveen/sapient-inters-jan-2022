package com.naveen.day4.isaworks;

public class Truck extends Vehicle{
	public Truck() {
		System.out.println("Truck is created");
	}
	public void maxWeight() {
		System.out.println("Truck Max Capacity Govt will Give");
	}
	@Override
	public void move() {
		System.out.println("Truck is Moving");
	}
	
	
	
}
