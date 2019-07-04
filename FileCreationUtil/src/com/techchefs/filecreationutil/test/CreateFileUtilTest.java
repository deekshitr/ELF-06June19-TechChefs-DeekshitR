package com.techchefs.filecreationutil.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techchefs.filecreationutil.util.CreateFileUtil;

public class CreateFileUtilTest {
	
	private CreateFileUtil util = new CreateFileUtil();
	
	@Test
	public void createFileTest() {
		boolean expected = true;
		boolean actual = util.createFile("mytest.txt", "This is test file");
		assertEquals(expected, actual);
	}
	
}
