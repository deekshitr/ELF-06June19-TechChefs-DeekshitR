package com.techchefs.javaapp.eighthassignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

/* USE CASE :
 * WriteInfoPrgmOne is a main class storing values using Properties file
 * 
 */

//SOLUTION :
@Log
public class WriteInfoPrgmOne {
public static void main(String[] args) {
		
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("PersonalInfo.properties");
			

			Properties p = new Properties();
			p.setProperty("Name", "Nistha");
			p.setProperty("PhoneNumber", "899088980");
			p.setProperty("address", "Kanpur");
			p.setProperty("Height", "5.1");
			
			p.store(fout, "Company Details");
			
			log.info("file Created");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}//end of main
}//end of class
