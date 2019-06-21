package com.techchefs.javaapp.collection.list.linkedlist1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example3 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("abc1");
		ll.add("abc2");
		ll.add("abc3");
		ll.add("abc4");
		ll.add("abc5");
		ll.add("abc6");

		for (int i = 0; i < ll.size(); i++) {
			String r = ll.get(i);
			System.out.println("using for loop " + r);
		}

		for (String r : ll) {
			System.out.println("using foreach " + r);
		}

		Iterator<String> it = ll.iterator();

		while (it.hasNext()) {
			String r = it.next();
			System.out.println("using Iterator " + r);
		}

		ListIterator<String> li = ll.listIterator();

		while (li.hasNext()) {
			String r = li.next();
			System.out.println("using List Iterator " + r);
		}
		while (li.hasPrevious()) {
			String r = li.previous();
			System.out.println("previous using List Iterator " + r);
		}

	}

}
