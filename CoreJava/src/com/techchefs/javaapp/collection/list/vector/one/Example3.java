package com.techchefs.javaapp.collection.list.vector.one;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example3 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		v.add("abc1");
		v.add("abc2");
		v.add("abc3");
		v.add("abc4");
		v.add("abc5");
		v.add("abc6");
		

		for (int i = 0; i < v.size(); i++) {
			String r = v.get(i);
			System.out.println("using for loop " + r);
		}

		for (String r : v) {
			System.out.println("using foreach " + r);
		}

		Iterator<String> it = v.iterator();

		while (it.hasNext()) {
			String r = it.next();
			System.out.println("using Iterator " + r);
		}

		ListIterator<String> li = v.listIterator();

		while (li.hasNext()) {
			String r = li.next();
			System.out.println("using List Iterator " + r);
		}
		while (li.hasPrevious()) {
			String r = li.previous();
			System.out.println("previous using List Iterator " + r);
		}
		
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			String r = e.nextElement();
			System.out.println("using Enumaration Iterator " + r);
		}
	}

}
