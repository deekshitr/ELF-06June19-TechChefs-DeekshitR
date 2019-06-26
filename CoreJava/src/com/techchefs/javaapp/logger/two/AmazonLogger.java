package com.techchefs.javaapp.logger.two;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AmazonLogger {
	private static final Logger loger = Logger.getLogger("amazon");
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);
		
		try {
			FileHandler fh = new FileHandler("amazonLogdata.log",true);
			fh.setLevel(Level.ALL);
			fh.setFormatter(new SimpleFormatter());
			loger.addHandler(fh);
			
			loger.log(Level.SEVERE, "Hi, its a SEVERE message");
			loger.log(Level.WARNING, "Hi, its a WARNING message");
			loger.log(Level.INFO, "Hi, its a INFO message");
			loger.log(Level.CONFIG, "Hi, its a CONFIG message");
			loger.log(Level.FINE, "Hi, its a FINE message");
			loger.log(Level.FINER, "Hi, its a FINER message");
			loger.log(Level.FINEST, "Hi, its a FINEST message");
			
			Register r = new Register();
			r.connetDb();
			r.store();
			
			Login l = new Login();
			l.validateUser();
			l.navigate();
			
		} catch (SecurityException | IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
