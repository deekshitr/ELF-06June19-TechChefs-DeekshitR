package com.techchefs.javaapp.logger.two;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
	private static final Logger loger = Logger.getLogger("amazon");
	void connetDb() {
		loger.log(Level.SEVERE, "Hi, its a SEVERE message in Register connetDb");
		loger.log(Level.WARNING, "Hi, its a WARNING message in Register connetDb");
		loger.log(Level.INFO, "Hi, its a INFO message in Register connetDb");
		loger.log(Level.CONFIG, "Hi, its a CONFIG message in Register connetDb");
		loger.log(Level.FINE, "Hi, its a FINE message in Register connetDb");
		loger.log(Level.FINER, "Hi, its a FINER message in Register connetDb");
		loger.log(Level.FINEST, "Hi, its a FINEST message in Register connetDb");
	}
	
	void store() {
		loger.log(Level.SEVERE, "Hi, its a SEVERE message in Register store");
		loger.log(Level.WARNING, "Hi, its a WARNING message in Register store");
		loger.log(Level.INFO, "Hi, its a INFO message in Register store");
		loger.log(Level.CONFIG, "Hi, its a CONFIG message in Register store");
		loger.log(Level.FINE, "Hi, its a FINE message in Register store");
		loger.log(Level.FINER, "Hi, its a FINER message in Register store");
		loger.log(Level.FINEST, "Hi, its a FINEST message in Register store");
	}
}
