package com.techchefs.javaapp.collection.set.hashset1;

import java.util.HashSet;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(23);
		hs.add(45.23);
		hs.add('S');
		hs.add("abc");
		hs.add(true);

		for (Object r : hs) {
			System.out.println("using foreach " + r);
		}

		Iterator it = hs.iterator();

		while (it.hasNext()) {
			Object r = it.next();
			System.out.println("using Iterator " + r);
		}

	}

}
