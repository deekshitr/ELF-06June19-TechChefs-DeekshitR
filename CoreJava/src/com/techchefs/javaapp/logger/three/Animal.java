package com.techchefs.javaapp.logger.three;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Animal {
	private static final Logger loger = Logger.getLogger("animal");
	void sound () {
		
		loger.log(Level.SEVERE, "Hi, its a SEVERE message in Animal");
		loger.log(Level.WARNING, "Hi, its a WARNING message in Animal");
		loger.log(Level.INFO, "Hi, its a INFO message in Animal");
		loger.log(Level.CONFIG, "Hi, its a CONFIG message in Animal");
		loger.log(Level.FINE, "Hi, its a FINE message in Animal");
		loger.log(Level.FINER, "Hi, its a FINER message in Animal");
		loger.log(Level.FINEST, "Hi, its a FINEST message in Animal");
		
		System.out.println("animal sound");
	}
	
}
