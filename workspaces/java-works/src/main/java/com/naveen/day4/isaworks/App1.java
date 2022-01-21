package com.naveen.day4.isaworks;


public class App1 {
	public static void main(String[] args) {
		Vehicle vehicles[] = new Vehicle[5];

		vehicles[0] = new Car();
		vehicles[1] = new Truck();
		vehicles[2] = new Car();
		vehicles[3] = new Truck();
		vehicles[4] = new Car();
		
		 
		
		for(Vehicle vh : vehicles) {
			MyBusiessLogic.displayVehicle(vh);
		}
		
	}
}
