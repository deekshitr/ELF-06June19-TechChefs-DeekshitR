package com.techchefs.javaapp.arrays2;

import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class MyArrayClassTest {
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		log.info("start time execution "+ startTime/1000);
		
		MyArrayClass myArrayClass = new MyArrayClass();
		int dataSize = 15;
		
		//Adding 5 values
		for(int i = 0;i<dataSize;i++) {
			myArrayClass.add(i);
		}
		
		//Remove value 
		//myArrayClass.remove(10);		
		
		
		//Getting values
		for(int i = 0;i<dataSize;i++) {
			log.info("get array value "+myArrayClass.get(i));
		}
		
		log.info("Size of array "+ myArrayClass.getSize());
		
		long endTime = System.currentTimeMillis();
		
		log.info("start time execution "+ endTime/1000);
	}

}
