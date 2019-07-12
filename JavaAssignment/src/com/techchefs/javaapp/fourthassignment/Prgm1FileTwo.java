package com.techchefs.javaapp.fourthassignment;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

import lombok.extern.java.Log;

/* USE CASE :
 * Prgm1FileOne is a main test class 
 * to create a file and read into it
 */

//SOLUTION :
@Log
public class Prgm1FileTwo {
	
	public static void main(String[] args) {
		
		try {
			log.info("reading the file....");
			String fileData = FileUtils.readFileToString(new File("File1.txt"),Charset.defaultCharset());
			
			log.info("file data is :" + fileData);
			
			FileUtils.writeStringToFile(new File("File2.txt"), fileData,Charset.defaultCharset());
			
			log.info("Writing string in next file.....");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
