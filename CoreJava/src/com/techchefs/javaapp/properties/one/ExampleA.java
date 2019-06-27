package com.techchefs.javaapp.properties.one;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class ExampleA {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new FileOutputStream("demo.properties");
			
			Properties p = new Properties();
			p.setProperty("companyName", "TestYantra");
			p.setProperty("phoneNumber", "9988776655");
			p.store(fout, "Company details");
			log.info("file created");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
