package com.techchefs.javaapp.thread.one;

import lombok.extern.java.Log;

@Log
public class Pen extends Thread {
	
	@Override
	public void run() {
		String s = getName();
		
		for (int i = 1; i <= 5; i++) {
			log.info(s+"---->" + i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				log.info("InterruptedException: " + e);
			}
		}
	}
}
