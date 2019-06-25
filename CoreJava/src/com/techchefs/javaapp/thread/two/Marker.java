package com.techchefs.javaapp.thread.two;

import lombok.extern.java.Log;

@Log
public class Marker extends Thread {
	
	@Override
	public void run() {
		String s = getName();
		log.info("s : "+s);
	}
}
