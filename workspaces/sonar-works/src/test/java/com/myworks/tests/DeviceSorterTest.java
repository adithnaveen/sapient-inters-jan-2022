package com.myworks.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.myworks.beans.Device;
import com.myworks.bl.Car;
import com.myworks.contract.IVehicle;

public class DeviceSorterTest {
 
	IVehicle vehicle = null; 
	@Before
	public void setUp() {
	 vehicle = new Car(); 
	}

	@Test
	public void displayTest() {
		String name = "Maruti"; 
		Car c = new Car(); 
		assertEquals("hi " + name, c.testMe(name));
	}

	@Test
	public void testGetdId() {
		Device d = new Device(); 
		
		d.setdId(101);
		d.setdName("laptop");
		
		assertEquals(101, d.getdId());
	}
	
}
