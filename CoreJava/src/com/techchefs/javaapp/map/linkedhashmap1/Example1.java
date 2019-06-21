package com.techchefs.javaapp.map.linkedhashmap1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Example1 {

	public static void main(String[] args) {
		LinkedHashMap<Character, Double> lhm = new LinkedHashMap<Character, Double>();

		lhm.put('a', 345.34);
		lhm.put('b', 56.23);
		lhm.put('c', 768.456);
		lhm.put('d', 9234.23);

		for (Entry<Character, Double> me : lhm.entrySet()) {
			Character key = me.getKey();
			Double value = me.getValue();

			System.out.println("Key is : " + key);
			System.out.println("Value is : " + value);

		}

	}

}
