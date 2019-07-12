package com.techchefs.javaapp.eighthassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

/* USE CASE :
 * ReadInfoPrgmOne is a main class loading values from Properties file
 * 
 */

//SOLUTION :
@Log
public class ReadInfoPrgmTwo {
	
	public static void main(String[] args) {
		
		FileInputStream fin;
		try {
			fin = new FileInputStream("PersonalInfo.properties");
			Properties pr = new Properties();
			pr.load(fin);
			
			log.info("Name is :" + pr.getProperty("Name"));
			log.info("address is :" + pr.getProperty("address"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
	}//end of main

}//end of class
