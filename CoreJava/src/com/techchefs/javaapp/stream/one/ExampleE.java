package com.techchefs.javaapp.stream.one;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log
public class ExampleE {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(5);
		al.add(4);
		al.add(8);
		al.add(7);
		
		Comparator<Integer> c = (i,j)-> {
			if (i>j) {
				return -1;
			} else if(i<j) {
				return 1;
			} else {
				return 0;
			}
		};
		
		List<Integer> b2 = al.stream().sorted(c).collect(Collectors.toList());
		log.info("sorted b2 : "+b2);
		
	}
}
