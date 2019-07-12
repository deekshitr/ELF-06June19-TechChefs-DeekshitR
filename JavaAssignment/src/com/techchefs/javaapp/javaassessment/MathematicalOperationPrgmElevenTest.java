package com.techchefs.javaapp.javaassessment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/* USE CASE :
 * MathematicalOperationPrgmElevenTest is a test class 
 *of MathematicalOperationPrgmEleven class
 * 
 */

//SOLUTION :
public class MathematicalOperationPrgmElevenTest {
	MathematicalOperationPrgmEleven operations = new MathematicalOperationPrgmEleven();
	
	@Test
	public void testSI() {
		
		double expected = 10;
		double actual = operations.calInterest(10,10,10);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testPer() {
		
		double expected = 80.0;
		double actual = operations.calPercent(80, 80, 80);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testFact() {
		
		int expected = 120;
		double actual = operations.calFactorial(5);
		assertEquals(expected, actual);
		
	}

}//end of test class
