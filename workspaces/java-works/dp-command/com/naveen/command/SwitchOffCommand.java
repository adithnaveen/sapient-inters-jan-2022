package com.naveen.command;

import com.naveen.devices.IElectonicDevice;

public class SwitchOffCommand implements Command{

	private IElectonicDevice device; 
	public SwitchOffCommand(IElectonicDevice device) {
		this.device = device; 
	}
	
	@Override
	public void execute() {
		device.switchOff(); 
	}

}
