package com.techchefs.javaapp.collection.list.vector1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example1 {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add(32);
		v.add(45.332);
		v.add('D');
		v.add("abc");
		v.add(true);
		

		for (int i = 0; i < v.size(); i++) {
			Object r = v.get(i);
			System.out.println("using for loop " + r);
		}

		for (Object r : v) {
			System.out.println("using foreach " + r);
		}

		Iterator it = v.iterator();

		while (it.hasNext()) {
			Object r = it.next();
			System.out.println("using Iterator " + r);
		}

		ListIterator li = v.listIterator();

		while (li.hasNext()) {
			Object r = li.next();
			System.out.println("using List Iterator " + r);
		}
		while (li.hasPrevious()) {
			Object r = li.previous();
			System.out.println("previous using List Iterator " + r);
		}
		
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			Object r = e.nextElement();
			System.out.println("using Enumaration Iterator " + r);
		}
		
	}

}
