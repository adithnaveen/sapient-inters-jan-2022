package com.naveen.remote;

import com.naveen.command.Command;
import com.naveen.command.SwitchOffCommand;
import com.naveen.command.SwitchOnCommand;
import com.naveen.devices.IElectonicDevice;

public class RemoteControl {
	private Command switchOn; 
	private Command switchOff; 
	
	public RemoteControl(final IElectonicDevice device) {
		this.switchOn = new SwitchOnCommand(device); 
		this.switchOff = new SwitchOffCommand(device); 
	}
	
	public void changeDevice(IElectonicDevice device) {
		this.switchOn = new SwitchOnCommand(device); 
		this.switchOff = new SwitchOffCommand(device); 
	}
	
	public void on() {
		switchOn.execute(); 
	}
	public void off() {
		switchOff.execute(); 
	}
}
