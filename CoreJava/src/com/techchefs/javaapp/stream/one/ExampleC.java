package com.techchefs.javaapp.stream.one;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class ExampleC {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		
		Predicate<Integer> p1 = i->i%2!=0;
		long x1 = al.stream().filter(p1).count();
		log.info("x1 : "+x1);

	}
}
