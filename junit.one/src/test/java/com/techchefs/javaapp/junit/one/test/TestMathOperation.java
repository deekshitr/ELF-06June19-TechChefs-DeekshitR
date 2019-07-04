package com.techchefs.javaapp.junit.one.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techchefs.javaapp.mathoperation.MathOperation;

public class TestMathOperation {
	
	private MathOperation m = new MathOperation();
	
	@Test
	public void testAdd() {
		assertEquals(60, m.add(10,50));
	}
	
	@Test
	public void testDivision() {
		assertEquals(2, m.divide(10, 5));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivForException() {
		m.divide(10, 0);
	}
}
