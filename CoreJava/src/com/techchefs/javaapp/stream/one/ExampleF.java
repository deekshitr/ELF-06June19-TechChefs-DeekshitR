package com.techchefs.javaapp.stream.one;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class ExampleF {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(5);
		al.add(4);
		al.add(8);
		al.add(7);
		
		al.stream().forEach(i->log.info("i: "+i));
		
		
		
	}
}
