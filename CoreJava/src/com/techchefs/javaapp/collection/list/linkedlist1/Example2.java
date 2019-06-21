package com.techchefs.javaapp.collection.list.linkedlist1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example2 {

	public static void main(String[] args) {
		LinkedList<Double> ll = new LinkedList<Double>();
		ll.add(2.234);
		ll.add(32.34);
		ll.add(42.34);
		ll.add(672.34);
		ll.add(562.34);
		ll.add(342.34);
		
		for (int i = 0; i < ll.size(); i++) {
			Double r = ll.get(i);
			System.out.println("using for loop " + r);
		}

		for (Double r : ll) {
			System.out.println("using foreach " + r);
		}

		Iterator<Double> it = ll.iterator();

		while (it.hasNext()) {
			Double r = it.next();
			System.out.println("using Iterator " + r);
		}

		ListIterator<Double> li = ll.listIterator();

		while (li.hasNext()) {
			Double r = li.next();
			System.out.println("using List Iterator " + r);
		}
		while (li.hasPrevious()) {
			Double r = li.previous();
			System.out.println("previous using List Iterator " + r);
		}

	}

}
