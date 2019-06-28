package com.techchefs.assessment.four;

import java.util.logging.Logger;

public class ServerTest {
	static Logger log = Logger.getLogger("ServerTest");
	public static void main(String[] args) {
		Server s = new Server();
		
		try {
			double temp = s.getServerRoomTemp(20);
		    log.info("Temperature : "+temp);
		} catch(MaximumTemperatureException e) {
			log.info("Exception: "+e.getMessage());
		}
		
	}

}
