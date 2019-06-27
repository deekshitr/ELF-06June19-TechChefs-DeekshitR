package com.techchefs.javaapp.properties.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class ExampleB {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("demo.properties");
			Properties p = new Properties();
			
			p.load(fin);
			
			String phone = p.getProperty("phoneNumber");
			String cmpName = p.getProperty("companyName");
			
			log.info("phone: "+phone);
			log.info("cmpName: "+cmpName);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				

	}

}
