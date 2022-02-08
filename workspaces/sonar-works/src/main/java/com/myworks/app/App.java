package com.myworks.app;

import com.myworks.bl.Car;
import com.myworks.bl.Lorry;
import com.myworks.contract.IVehicle;

class MyBl {
	public void display(IVehicle [] vehicles) {
		for(IVehicle v : vehicles) {
			v.move();
		}
	}
}

public class App {
	public static void main(String[] args) {
		IVehicle [] vehicles = new IVehicle[3]; 
		
		vehicles[0] = new Car(); 
		vehicles[1] = new Lorry(); 
		vehicles[2] = new Car();
	
	}
}
