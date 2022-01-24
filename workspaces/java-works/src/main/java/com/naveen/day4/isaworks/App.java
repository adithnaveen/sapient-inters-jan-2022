package com.naveen.day4.isaworks;

public class App {
	public static void main(String[] args) {

	
		Vehicle vehicles[] = new Vehicle[5];

		vehicles[0] = new Car();
		vehicles[1] = new Truck();
		vehicles[2] = new Car();
		vehicles[3] = new Truck();
		vehicles[4] = new Car();

		for (int i = 0; i < vehicles.length; i++) {
			System.out.println("--------------------------------");
			vehicles[i].move();
			if (vehicles[i] instanceof Car) {
				((Car) vehicles[i]).fuelCapacity(i * 10);
			} else if (vehicles[i] instanceof Truck) {
				((Truck) vehicles[i]).maxWeight();
			}
		}

	}
}
