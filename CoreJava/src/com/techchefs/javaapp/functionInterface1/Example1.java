package com.techchefs.javaapp.functionInterface1;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class Example1 {

	public static void main(String[] args) {
		
		Function<Double, Double> f1 = r->3.142*r*r;
		
		double x1 = f1.apply(5.2);
		
		log.info("x1: "+x1);
		
		Function<String, Integer> f2 = r->r.length();
		
		int x2 = f2.apply("abcd");
		
		log.info("x2: "+x2);
		
		Function<Double, Double> f3 = r->r*r;
		
		double x3 = f3.apply(12.45);
		
		log.info("x3: "+x3);
	}

}
