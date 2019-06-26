package com.techchefs.javaapp.collection.set.hashset.one;

import java.util.HashSet;
import java.util.Iterator;

public class Example2 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("abc1");
		hs.add("abc2");
		hs.add("abc3");
		hs.add("abc4");
		hs.add("abc5");
		hs.add("abc6");
		
		for(String r:hs) {
			System.out.println("using foreach " + r);
		}
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			String r = it.next();
			System.out.println("using Iterator " + r);
		}

	}

}
