package com.naveen.day4.isaworks;


public class App1 {
	public static void main(String[] args) {
		Vehicle vehicles[] = new Vehicle[5];

		vehicles[0] = new Car();
		vehicles[1] = new Truck();
		vehicles[2] = new Vehicle() {

			@Override
			public void move() {
				System.out.println("hey the BUS is moving");
			}

			@Override
			public void licence() {
				System.out.println("this is special licence to drive public transport");
			}
			 
		};
		vehicles[3] = new Truck();
		vehicles[4] = new TwoWheeler(); 
		
		 
		
		for(Vehicle vh : vehicles) {
			MyBusiessLogic.displayVehicle(vh);
		}
		
	}
}
