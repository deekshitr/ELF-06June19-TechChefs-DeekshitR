package com.techchefs.javaapp.collection.list.vector.one;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example2 {

	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		
		v.add(35.56);
		v.add(56.23);
		v.add(38.23);
		v.add(78.34);
		v.add(23.56);
		

		for (int i = 0; i < v.size(); i++) {
			Double r = v.get(i);
			System.out.println("using for loop " + r);
		}

		for (Double r : v) {
			System.out.println("using foreach " + r);
		}

		Iterator<Double> it = v.iterator();

		while (it.hasNext()) {
			Double r = it.next();
			System.out.println("using Iterator " + r);
		}

		ListIterator<Double> li = v.listIterator();

		while (li.hasNext()) {
			Double r = li.next();
			System.out.println("using List Iterator " + r);
		}
		while (li.hasPrevious()) {
			Double r = li.previous();
			System.out.println("previous using List Iterator " + r);
		}
		
		Enumeration<Double> e = v.elements();
		while (e.hasMoreElements()) {
			Double r = e.nextElement();
			System.out.println("using Enumaration Iterator " + r);
		}
		
	}

}
