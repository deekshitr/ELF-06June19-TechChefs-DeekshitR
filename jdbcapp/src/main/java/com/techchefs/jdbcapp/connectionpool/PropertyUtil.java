package com.techchefs.jdbcapp.connectionpool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {
	
	private static PropertyUtil util = null;
	Properties properties = null; 
	
	public static PropertyUtil getPropertyUtil() throws Exception, IOException {
		
		if (util==null) {
			util = new PropertyUtil();
		}
		return util;
	}
	
	private PropertyUtil() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream("db.properties"));
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
	
	
	
}
