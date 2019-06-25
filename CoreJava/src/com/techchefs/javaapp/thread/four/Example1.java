package com.techchefs.javaapp.thread.four;

public class Example1 {

	public static void main(String[] args) {
		Marker m = new Marker();
		
		Thread t1 = new Thread(m);
		t1.start();
		
		Thread t2 = new Thread(m);
		t2.start();

	}

}
