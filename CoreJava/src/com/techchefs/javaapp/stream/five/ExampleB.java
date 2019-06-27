package com.techchefs.javaapp.stream.five;

import lombok.extern.java.Log;

@Log
public class ExampleB {

	public static void main(String[] args) {
		
		Demo d1 = x->log.info("value: "+x);
		d1.print(8);
		
		Demo d3 = System.out::println;
		d3.print(10);
		
		Pen p = new Pen();
		Demo d2 = p::write;
		
		d2.print(6);
	}

}
