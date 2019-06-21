package com.techchefs.javaapp.collection.set.treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Example2 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("abc1");
		ts.add("abc2");
		ts.add("abc3");
		ts.add("abc4");
		ts.add("abc5");
		ts.add("abc6");
		
		for (String r : ts) {
			System.out.println("using foreach " + r);
		}

		Iterator<String> it = ts.iterator();

		while (it.hasNext()) {
			String r = it.next();
			System.out.println("using Iterator " + r);
		}
	}

}
