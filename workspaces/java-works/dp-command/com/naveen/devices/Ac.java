package com.naveen.devices;

public class Ac implements IElectonicDevice {

	@Override
	public void switchOn() {
		System.out.println("Ac Switch On");
	}

	@Override
	public void switchOff() {
		System.out.println("Ac Switch Off");
	}

}
