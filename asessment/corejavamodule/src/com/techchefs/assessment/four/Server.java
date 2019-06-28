package com.techchefs.assessment.four;

import java.util.logging.Logger;

public class Server {
	Logger log = Logger.getLogger("Server");
	
	double getServerRoomTemp(double temp) throws MaximumTemperatureException {
		if (temp >= 18) {
			throw new MaximumTemperatureException();
		} else {
			return temp;
		}
	}
}
