package com.techchefs.javaapp.map.treemap.one;

import java.util.TreeMap;
import java.util.Map.Entry;

public class Example1 {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("one", 1);
		tm.put("two", 2);
		tm.put("three", 3);
		tm.put("four", 4);

		for (Entry<String, Integer> me : tm.entrySet()) {
			String key = me.getKey();
			Integer value = me.getValue();

			System.out.println("Key is : " + key);
			System.out.println("Value is : " + value);

		}

	}

}
