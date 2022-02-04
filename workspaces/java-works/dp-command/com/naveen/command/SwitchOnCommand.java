package com.naveen.command;

import com.naveen.devices.IElectonicDevice;

public class SwitchOnCommand implements Command {

	private IElectonicDevice device; 
	
	public SwitchOnCommand(IElectonicDevice device) {
		this.device = device; 
	}
	
	@Override
	public void execute() {
		device.switchOn(); 
	}

}
