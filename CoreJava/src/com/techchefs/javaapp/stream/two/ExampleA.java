package com.techchefs.javaapp.stream.two;

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
		
		List<Integer> x1 = al.stream().map(i->i*2).collect(Collectors.toList());
		log.info("x1 : "+x1);
	}

}
