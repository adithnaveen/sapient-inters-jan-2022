package com.naveen.day4.isaworks;

class MyBusiessLogic {
	public static void displayVehicle(Vehicle vehicle) {
		System.out.println("-------------------------------");
		vehicle.move();
		vehicle.licence();
		if (vehicle instanceof Car) {
			((Car) vehicle).fuelCapacity(100);
		} else if (vehicle instanceof Truck) {
			((Truck) vehicle).maxWeight();
		}
	}
}