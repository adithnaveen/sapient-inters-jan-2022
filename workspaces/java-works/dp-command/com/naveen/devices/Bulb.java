package com.naveen.devices;

public class Bulb implements IElectonicDevice{

	@Override
	public void switchOn() {
		System.out.println("Bulb Switch On");
	}

	@Override
	public void switchOff() {
		System.out.println("Bulb Switch Off");
	}

}
