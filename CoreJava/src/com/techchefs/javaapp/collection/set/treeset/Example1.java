package com.techchefs.javaapp.collection.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add(789);
		ts.add(56);
		ts.add(34);
		ts.add(234);
		ts.add(567);

		for (Object r : ts) {
			System.out.println("using foreach " + r);
		}

		Iterator it = ts.iterator();

		while (it.hasNext()) {
			Object r = it.next();
			System.out.println("using Iterator " + r);
		}

	}

}
