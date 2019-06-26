package com.techchefs.javaapp.logger.two;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {
	private static final Logger loger = Logger.getLogger("amazon");
	void validateUser() {
		loger.log(Level.SEVERE, "Hi, its a SEVERE message in Login validateUser");
		loger.log(Level.WARNING, "Hi, its a WARNING message in Login validateUser");
		loger.log(Level.INFO, "Hi, its a INFO message in Login validateUser");
		loger.log(Level.CONFIG, "Hi, its a CONFIG message in Login validateUser");
		loger.log(Level.FINE, "Hi, its a FINE message in Login validateUser");
		loger.log(Level.FINER, "Hi, its a FINER message in Login validateUser");
		loger.log(Level.FINEST, "Hi, its a FINEST message in Login validateUser");
	}
	void navigate() {
		loger.log(Level.SEVERE, "Hi, its a SEVERE message in Login navigate");
		loger.log(Level.WARNING, "Hi, its a WARNING message in Login navigate");
		loger.log(Level.INFO, "Hi, its a INFO message in Login navigate");
		loger.log(Level.CONFIG, "Hi, its a CONFIG message in Login navigate");
		loger.log(Level.FINE, "Hi, its a FINE message in Login navigate");
		loger.log(Level.FINER, "Hi, its a FINER message in Login navigate");
		loger.log(Level.FINEST, "Hi, its a FINEST message in Login navigate");
	}
}
