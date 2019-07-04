package com.techchefs.javaapp.junit.one.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techchefs.javaapp.stringoperation.StringOperation;

public class TestStringOperation {

	private StringOperation s = new StringOperation();
	
	@Test
	public void testCount() {
		assertEquals(5, s.count("tarun"));
	}
	
	@Test
	public void testUpperCase() {
		assertEquals("TARUN", s.upperCase("tarun"));
	}
	
	@Test(expected = NullPointerException.class)
	public void testCountForException() {
		s.count(null);
	}

}
