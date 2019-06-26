package com.techchefs.javaapp.logger.three;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lion extends Animal {
	private static final Logger loger = Logger.getLogger("animal");
	void sound () {
		loger.log(Level.SEVERE, "Hi, its a SEVERE message in Lion");
		loger.log(Level.WARNING, "Hi, its a WARNING message in Lion");
		loger.log(Level.INFO, "Hi, its a INFO message in Lion");
		loger.log(Level.CONFIG, "Hi, its a CONFIG message in Lion");
		loger.log(Level.FINE, "Hi, its a FINE message in Lion");
		loger.log(Level.FINER, "Hi, its a FINER message in Lion");
		loger.log(Level.FINEST, "Hi, its a FINEST message in Lion");
		System.out.println("Lion sound");
	}
	void divide() {
		loger.log(Level.SEVERE, "Hi, its a SEVERE message in Lion");
		loger.log(Level.WARNING, "Hi, its a WARNING message in Lion");
		loger.log(Level.INFO, "Hi, its a INFO message in Lion");
		loger.log(Level.CONFIG, "Hi, its a CONFIG message in Lion");
		loger.log(Level.FINE, "Hi, its a FINE message in Lion");
		loger.log(Level.FINER, "Hi, its a FINER message in Lion");
		loger.log(Level.FINEST, "Hi, its a FINEST message in Lion");
		System.out.println("Lion divide");
	}
}
