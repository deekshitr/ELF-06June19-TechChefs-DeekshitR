package com.techchefs.javaapp.thread.three;

import lombok.extern.java.Log;

@Log
public class PVR {
	
	synchronized void book() {
		for(int i=0;i<5;i++) {
			log.info("i---> "+i);
			try {
				wait();
//				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized void release() {
		notify();
//		notifyAll();
	}
}
