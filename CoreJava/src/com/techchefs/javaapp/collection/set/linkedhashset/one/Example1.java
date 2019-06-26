package com.techchefs.javaapp.collection.set.linkedhashset.one;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example1 {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(23);
		lhs.add(45.23);
		lhs.add('S');
		lhs.add("abc");
		lhs.add(true);

		for (Object r : lhs) {
			System.out.println("using foreach " + r);
		}

		Iterator it = lhs.iterator();

		while (it.hasNext()) {
			Object r = it.next();
			System.out.println("using Iterator " + r);
		}

	}

}
