package com.techchefs.javaapp.thread.three;

public class Example1 {

	public static void main(String[] args) {
		PVR p1 = new PVR();
		
		Browser t1 = new Browser(p1);
		t1.start();
		
		Browser t2 = new Browser(p1);
		t2.start();
		
		Browser t3 = new Browser(p1);
		t3.start();
		
		p1.release();

	}

}
