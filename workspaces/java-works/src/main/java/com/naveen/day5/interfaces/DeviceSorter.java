package com.naveen.day5.interfaces;

import java.util.Arrays;

public class DeviceSorter {
	public static void main(String[] args) {
		Device devices[] = new Device[5] ;
		
		devices[0] = new Device(123, "KeyBoard");
		devices[1] = new Device(45, "Monitor"); 
		devices[2] = new Device(145, "Printer"); 
		devices[3] = new Device(12, "Mouse"); 
		devices[4] = new Device(44, "Laptop"); 
		
		for(Device d : devices) {
			System.out.println(d);
		}
		
		Arrays.sort(devices);
		System.out.println("-----------------------");

		for(Device d : devices) {
			System.out.println(d);
		}
		
	}
}
