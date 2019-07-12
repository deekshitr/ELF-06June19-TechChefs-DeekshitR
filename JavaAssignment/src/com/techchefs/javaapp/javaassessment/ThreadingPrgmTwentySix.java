package com.techchefs.javaapp.javaassessment;

import lombok.extern.java.Log;

/* USE CASE :
 * ThreadingPrgmTwentySix is a Thread class  
 * and have a run which is printing the name of thread
 * 
 */

//SOLUTION :
@Log
public class ThreadingPrgmTwentySix extends Thread{
	String name;

	public ThreadingPrgmTwentySix(String name) {
		this.name = name;
	}

	
	@Override
	public void run() {
		log.info("started-----> " + name);
		for(int i=0; i<10; i++) {
			String s = getName();
			log.info(""+s);	
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		log.info("ended-----> " + name);
	}
	

}//end of class
