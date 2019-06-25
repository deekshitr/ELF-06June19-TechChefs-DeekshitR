package com.techchefs.javaapp.thread.one;

import lombok.extern.java.Log;

@Log
public class Example1 {

	public static void main(String[] args) {
		
		log.info("main started");
		Pen p1 = new Pen();
		p1.setName("A");
		p1.setPriority(10);
		p1.start();
		
		Pen p2 = new Pen();
		p2.setName("B");
		p2.setPriority(5);
		p2.start();
		
		Pen p3 = new Pen();
		p3.setName("C");
		p3.setPriority(1);
		p3.start();
		
		try {
			p1.join();
			p2.join();
			p3.join();
		} catch (InterruptedException e) {
			log.info("InterruptedException: "+e);
		}
		log.info("main ended");
	}

}
