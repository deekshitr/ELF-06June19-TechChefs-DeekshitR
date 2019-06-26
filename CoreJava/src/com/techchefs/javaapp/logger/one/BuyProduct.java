package com.techchefs.javaapp.logger.one;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuyProduct {
	
	private static final Logger loger = Logger.getLogger("flipkart");
	
	void buy () {
		loger.log(Level.SEVERE, "Hi, its a SEVERE message in BuyProduct");
		loger.log(Level.WARNING, "Hi, its a WARNING message in BuyProduct");
		loger.log(Level.INFO, "Hi, its a INFO message in BuyProduct");
		loger.log(Level.CONFIG, "Hi, its a CONFIG message in BuyProduct");
		loger.log(Level.FINE, "Hi, its a FINE message in BuyProduct");
		loger.log(Level.FINER, "Hi, its a FINER message in BuyProduct");
		loger.log(Level.FINEST, "Hi, its a FINEST message in BuyProduct");
	}
	

}
