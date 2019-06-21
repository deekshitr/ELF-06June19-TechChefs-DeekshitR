package com.techchefs.javaapp.collection.list.linkedlist1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example1 {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(2);
		ll.add(32.34);
		ll.add('J');
		ll.add("abc");
		ll.add(true);
		
		for (int i = 0; i < ll.size(); i++) {
			Object r = ll.get(i);
			System.out.println("using for loop " + r);
		}

		for (Object r : ll) {
			System.out.println("using foreach " + r);
		}

		Iterator it = ll.iterator();

		while (it.hasNext()) {
			Object r = it.next();
			System.out.println("using Iterator " + r);
		}

		ListIterator li = ll.listIterator();

		while (li.hasNext()) {
			Object r = li.next();
			System.out.println("using List Iterator " + r);
		}
		while (li.hasPrevious()) {
			Object r = li.previous();
			System.out.println("previous using List Iterator " + r);
		}

	}

}
