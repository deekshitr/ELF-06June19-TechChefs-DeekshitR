package com.techchefs.javaapp.thread.five;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {

	public static void main(String[] args) {
		
		Mouse m1 = new Mouse("myFirst");
		Mouse m2 = new Mouse("mySecond");
		Mouse m3 = new Mouse("myThird");
		Mouse m4 = new Mouse("myFourth");
		Mouse m5 = new Mouse("myFifth");
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		service.execute(m4);
		service.execute(m5);
		
		service.shutdown();
	}

}
