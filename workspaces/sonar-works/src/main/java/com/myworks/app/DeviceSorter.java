package com.myworks.app;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myworks.beans.Device;



public class DeviceSorter {

	
	static Logger logger = LoggerFactory.getLogger(DeviceSorter.class); 
	
	
	public static void main(String[] args) {
		Device [] devices = new Device[5] ;
		
		devices[0] = new Device(123, "KeyBoard");
		devices[1] = new Device(45, "Monitor"); 
		devices[2] = new Device(145, "Printer"); 
		devices[3] = new Device(12, "Mouse"); 
		devices[4] = new Device(44, "Laptop"); 
		
		display(devices);
		
		Arrays.sort(devices);
		logger.trace("-------------------");

		display(devices);
		
	}


	public static void display(Device[] devices) {
		for(Device d : devices) {
			logger.info(d.toString());
		}
	}
}
