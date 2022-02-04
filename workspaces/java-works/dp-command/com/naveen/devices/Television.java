package com.naveen.devices;

public class Television implements IElectonicDevice{

	@Override
	public void switchOn() {
		System.out.println("Television Switch On ");
	}

	@Override
	public void switchOff() {
		System.out.println("Television Switch Off ");
	}
	
}
