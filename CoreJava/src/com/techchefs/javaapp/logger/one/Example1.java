package com.techchefs.javaapp.logger.one;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Example1 {

	private static final Logger loger = Logger.getLogger("flipkart");

	public static void main(String[] args) {
		
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);
		
		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.FINE);
		loger.addHandler(ch);
		
		loger.log(Level.SEVERE, "Hi, its a SEVERE message");
		loger.log(Level.WARNING, "Hi, its a WARNING message");
		loger.log(Level.INFO, "Hi, its a INFO message");
		loger.log(Level.CONFIG, "Hi, its a CONFIG message");
		loger.log(Level.FINE, "Hi, its a FINE message");
		loger.log(Level.FINER, "Hi, its a FINER message");
		loger.log(Level.FINEST, "Hi, its a FINEST message");
		

	}

}
