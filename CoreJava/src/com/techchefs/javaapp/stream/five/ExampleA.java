package com.techchefs.javaapp.stream.five;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class ExampleA {

	public static void main(String[] args) {
		
		Integer a[] = {5,6,2,8,4};
		
		Stream<Integer> s1 = Stream.of(a);
		
		s1.forEach(i->log.info("i "+i));
		
		Stream<Integer> s2 = Stream.of(4,2,7,5,1,9);
		
//		s2.forEach(i->log.info("i "+i));
		
		s2.forEach(System.out::println);

	}

}
