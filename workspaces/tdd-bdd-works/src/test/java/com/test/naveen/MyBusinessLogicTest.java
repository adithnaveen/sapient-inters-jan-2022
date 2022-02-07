package com.test.naveen;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.naveen.Employee;
import com.naveen.MyBusinessLogic;

public class MyBusinessLogicTest {
	MyBusinessLogic mbl;

	@Before
	public void setUp() {
		System.out.println("hey i'm before ");
		mbl =  new MyBusinessLogic();
	}
	
	@After
	public void tearDown() {
		System.out.println("hey i'm in after ");
	}

	@BeforeClass
	public static void setUpClass() {
		System.out.println("Before class... ");
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("After calss... ");
	}
	
	
	@Test
	public void sayHiTest() {
		String name = "Mohit";
		String expectedVal = "hi " + name;
		String retVAl = mbl.sayHi(name);

		assertEquals(expectedVal, retVAl);

	}

	@Test
	public void insertEmployeeTest() {
		assertTrue("employee not stored", mbl.insertEmployee(new Employee()));
	}
	
	@Test(timeout = 1500)
	public void delaySomeThingTest() {
		assertEquals("something", mbl.getSomething());
	}
	
	@Test(expected = RuntimeException.class)
	public void getEmployeeExceptionTest() {
		int empId = 101;
		
		assertNotNull(mbl.getEmployee(empId));
	}
	
	@Test 
	public void getEmployeeTest() {
		int empId = 100;
		
		assertNotNull(mbl.getEmployee(empId));
	}
	 
}
