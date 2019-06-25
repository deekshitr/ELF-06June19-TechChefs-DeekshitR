package com.techchefs.javaapp.thread.six;

import java.util.concurrent.Callable;

public class Pencile implements Callable<Integer>{
	
	@Override
	public Integer call() throws Exception {
		
		return 12;
	}
}
