package com.techchefs.javaapp.junit.one.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techchefs.javaapp.booleanoperation.BooleanOperation;

public class TestBooleanOperation {
	
	private BooleanOperation b = new BooleanOperation();
	@Test
	public void testIsEven() {
		assertEquals(false, b.isEven(5));
	}

}
