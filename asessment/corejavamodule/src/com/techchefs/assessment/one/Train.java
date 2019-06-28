package com.techchefs.assessment.one;

import java.util.logging.Logger;

public class Train {
	Logger log = Logger.getLogger("Train");
	public void search(int number) {
		log.info("Train searched by number "+ number);
	}
	
	public void search(String name) {
		log.info("Train searched by name "+ name);
	}
}
