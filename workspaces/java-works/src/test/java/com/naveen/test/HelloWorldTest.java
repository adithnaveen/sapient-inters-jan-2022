package com.naveen.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.naveen.HelloWolrd;

public class HelloWorldTest {

	@Test
	public void test() {
		assertEquals("Hello", new HelloWolrd().sayHi());
	}

}
