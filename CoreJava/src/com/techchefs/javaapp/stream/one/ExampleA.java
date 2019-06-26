package com.techchefs.javaapp.stream.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class ExampleA {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		
		List<Integer> x = al.stream().filter(i->i%2!=0).collect(Collectors.toList());
		
		log.info("x: "+x);
	}

}
