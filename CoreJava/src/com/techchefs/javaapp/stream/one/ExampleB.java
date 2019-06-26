package com.techchefs.javaapp.stream.one;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class ExampleB {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		
		Predicate<Integer> p1 = i->i%2!=0;
		List<Integer> x1 = al.stream().filter(p1).collect(Collectors.toList());
		log.info("x1: "+x1);
		
		Predicate<Integer> p2 = i->i%3==0;
		List<Integer> x2 = al.stream().filter(p2).collect(Collectors.toList());
		log.info("x2: "+x2);

	}

}
