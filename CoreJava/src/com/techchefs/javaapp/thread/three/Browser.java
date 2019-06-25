package com.techchefs.javaapp.thread.three;

public class Browser extends Thread {
	
	PVR ref;
	
	Browser(PVR ref) {
		this.ref = ref;
	}
	
	@Override
	public void run() {
		ref.book();
	}
}
