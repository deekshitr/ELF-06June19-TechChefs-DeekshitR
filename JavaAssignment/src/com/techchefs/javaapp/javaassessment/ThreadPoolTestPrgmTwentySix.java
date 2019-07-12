package com.techchefs.javaapp.javaassessment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* USE CASE :
 * TestMouse is a main class Of ThreadingPrgmTwentySix thread class
 * having five threads
 */

//SOLUTION :
public class ThreadPoolTestPrgmTwentySix {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadingPrgmTwentySix("First"));
		Thread t2 = new Thread(new ThreadingPrgmTwentySix("Second"));
		Thread t3 = new Thread(new ThreadingPrgmTwentySix("Third"));
		Thread t4 = new Thread(new ThreadingPrgmTwentySix("Fourth"));
		Thread t5 = new Thread(new ThreadingPrgmTwentySix("Fifth"));
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		service.execute(t1);
		service.execute(t2);
		service.execute(t3);
		service.execute(t4);
		service.execute(t5);
	}//end of main

}//end of class
