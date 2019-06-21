package com.techchefs.javaapp.collection.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example2 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet();
		lhs.add("abc1");
		lhs.add("abc2");
		lhs.add("abc3");
		lhs.add("abc4");
		lhs.add("abc5");
		lhs.add("abc6");
		
		for (String r : lhs) {
			System.out.println("using foreach " + r);
		}

		Iterator<String> it = lhs.iterator();

		while (it.hasNext()) {
			String r = it.next();
			System.out.println("using Iterator " + r);
		}
	}

}
