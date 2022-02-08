package com.naveen.mockito.works;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.naveen.Employee;
import com.naveen.IEmployeeService;

import static org.mockito.Mockito.*;

public class MockitoTest01 {

	@Test
	public void mockListTest() {
		 List list =  mock(List.class); 
		 when(list.size()).thenReturn(4);
		 
		 assertEquals(4, list.size());
	}
	
	@Test
	public void mockListTest1() {
		List list =  mock(List.class); 
		when(list.size()).thenReturn(4).thenReturn(3); 
		 assertEquals(4, list.size());
		 assertEquals(3, list.size());
	}
	
	@Test
	public void mockEmployeeserviceTest() {
		IEmployeeService empService = mock(IEmployeeService.class);
		Employee emp = new Employee(); 
		when(empService.getEmployee("kumar@gmail.com", "123456")).thenReturn(emp);
		
		assertNotNull(empService.getEmployee("kumar@gmail.com", "123456"));
		
	}
}
