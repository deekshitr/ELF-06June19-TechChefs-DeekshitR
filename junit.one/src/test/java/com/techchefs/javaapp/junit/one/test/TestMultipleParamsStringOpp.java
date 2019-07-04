package com.techchefs.javaapp.junit.one.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.techchefs.javaapp.stringoperation.StringOperation;

@RunWith(Parameterized.class)
public class TestMultipleParamsStringOpp {
	
	private StringOperation s = new StringOperation();
	
	private String name;
	private int value;
	
	public TestMultipleParamsStringOpp(String name,int value) {
		this.name = name;
		this.value=value;
	}
	
	@Parameters
	public static Collection<Object[]> getPairs() {
		Object[][] obj = {
				{"Harish",6},
				{"Neha",4},
				{"Indra jith",10}
		};
		return Arrays.asList(obj);
	}
	
	@Test
	public void testStringOperation() {
		int res = s.count(name);
		assertEquals(value, res);
		
	}

}
