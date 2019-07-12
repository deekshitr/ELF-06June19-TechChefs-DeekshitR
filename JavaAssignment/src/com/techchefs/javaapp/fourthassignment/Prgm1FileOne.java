package com.techchefs.javaapp.fourthassignment;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;

/* USE CASE :
 * Prgm1FileOne is a main test class 
 * to create a file and write into it
 */

//SOLUTION :
@Log
public class Prgm1FileOne {
	
	public static void main(String[] args) {
		
		try {
			FileUtils.writeStringToFile(new File("File1.txt"), "Nistha khare" , Charset.defaultCharset());
			
			log.info("File created");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// End of main

}// End of class
