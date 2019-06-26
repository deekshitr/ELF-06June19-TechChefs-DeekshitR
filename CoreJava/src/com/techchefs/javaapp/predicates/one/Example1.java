package com.techchefs.javaapp.predicates.one;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class Example1 {

	public static void main(String[] args) {
		
		Predicate<Integer> ie = (a)->a%2==0;
		
		boolean b1= ie.test(10);
		boolean b2= ie.test(15);
		
		log.info("b1: "+b1);
		log.info("b2: "+b2);
		
		Predicate<String> sl = (a) -> a.length()>=5;
		
		boolean b3 = sl.test("abcdef");
		boolean b4 = sl.test("abcd");
		
		log.info("b3: "+b3);
		log.info("b4: "+b4);
		
		int[] arr = {2,4,8,5,9,1};
		
		Predicate<Integer> ie1 = (a)->a%2==0;
		
		for (int i=0;i<arr.length;i++) {
			if (ie1.test(arr[i])) {
				log.info("even: "+arr[i]);
			}
		}
		
		Predicate<Integer> ie2 = (a)->a%2!=0;
		
		for (int i=0;i<arr.length;i++) {
			if (ie2.test(arr[i])) {
				log.info("Odd: "+arr[i]);
			}
		}
		
		Predicate<Integer> ie3 = (a)->a>4;
		
		for (int i=0;i<arr.length;i++) {
			if (ie3.test(arr[i])) {
				log.info("greater than 4: "+arr[i]);
			}
		}
		
	}

}
