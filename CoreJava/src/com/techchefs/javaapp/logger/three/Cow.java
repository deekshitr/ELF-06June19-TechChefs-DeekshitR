package com.techchefs.javaapp.logger.three;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cow extends Animal {
	private static final Logger loger = Logger.getLogger("animal");
	void sound () {
		loger.log(Level.SEVERE, "Hi, its a SEVERE message in Cow");
		loger.log(Level.WARNING, "Hi, its a WARNING message in Cow");
		loger.log(Level.INFO, "Hi, its a INFO message in Cow");
		loger.log(Level.CONFIG, "Hi, its a CONFIG message in Cow");
		loger.log(Level.FINE, "Hi, its a FINE message in Cow");
		loger.log(Level.FINER, "Hi, its a FINER message in Cow");
		loger.log(Level.FINEST, "Hi, its a FINEST message in Cow");
		System.out.println("Cow sound");
	}
	void divide() {
		loger.log(Level.SEVERE, "Hi, its a SEVERE message in Cow");
		loger.log(Level.WARNING, "Hi, its a WARNING message in Cow");
		loger.log(Level.INFO, "Hi, its a INFO message in Cow");
		loger.log(Level.CONFIG, "Hi, its a CONFIG message in Cow");
		loger.log(Level.FINE, "Hi, its a FINE message in Cow");
		loger.log(Level.FINER, "Hi, its a FINER message in Cow");
		loger.log(Level.FINEST, "Hi, its a FINEST message in Cow");
		System.out.println("Cow divide");
	}
}
