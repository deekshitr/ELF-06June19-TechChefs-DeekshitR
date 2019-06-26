package com.techchefs.javaapp.map.hashmap.one;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		
		System.out.println("\n");
		System.out.println("only keys*************************************");
		System.out.println("\n");
		
		Set<String> ts = hm.keySet();
		
		for (String s: ts) {
			System.out.println("Keys : "+s);
		}
		
		System.out.println("\n");
		System.out.println("only values*************************************");
		System.out.println("\n");
		
		Collection<Integer> ci = hm.values();
		
		Iterator<Integer> it = ci.iterator();
		
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println("Values : "+i);
		}
		
		
		System.out.println("\n");
		System.out.println("key and value*************************************");
		System.out.println("\n");

		for (Map.Entry<String, Integer> me : hm.entrySet()) {
			String key = me.getKey();
			Integer value = me.getValue();

			System.out.println("Key is : " + key);
			System.out.println("Value is : " + value);

		}
		
		

	}

}
