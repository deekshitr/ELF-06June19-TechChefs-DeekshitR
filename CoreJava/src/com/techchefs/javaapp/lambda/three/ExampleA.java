package com.techchefs.javaapp.lambda.three;

import lombok.extern.java.Log;

@Log
public class ExampleA {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			for (int i=0;i<5;i++) {
				log.info("i----> "+i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(r);
		t2.start();

	}

}
