package com.techchefs.javaapp.thread.six;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;

@Log
public class Example1 {

	public static void main(String[] args) {
		Pencile p = new Pencile();
		
		FutureTask<Integer> ft = new FutureTask<Integer>(p);
		
		Thread t1 = new Thread(ft);
		t1.start();
		
		try {
			int i = ft.get();
			log.info("i: "+i);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		

	}

}
