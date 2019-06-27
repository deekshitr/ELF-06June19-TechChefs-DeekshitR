package com.techchefs.javaapp.stream.three;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class ExampleA {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(7);
		al.add(5);
		al.add(6);
		al.add(2);
		
		Comparator<Integer> c = (i,j)->i.compareTo(j);
		List<Integer> x1 = al.stream().sorted(c).collect(Collectors.toList());
		
		Integer minValue = al.stream().min(c).get();
		log.info("minValue : "+minValue);
		
		Integer maxValue = al.stream().max(c).get();
		log.info("maxValue : "+maxValue);
	}

}
