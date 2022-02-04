package com.naveen.client;

import com.naveen.devices.Bulb;
import com.naveen.devices.IElectonicDevice;
import com.naveen.devices.Television;
import com.naveen.remote.RemoteControl;
import com.naveen.util.Operate;

public class AppCommand {
	public static void main(String[] args) {
		IElectonicDevice device = new Television(); 
		RemoteControl rc = new RemoteControl(device); 
		
		Operate.operate(rc);
		
		System.out.println("----------------");
		
		device = new Bulb();  
		rc.changeDevice(device);
		Operate.operate(rc);
			
		
	}
}
