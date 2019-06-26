package com.techchefs.javaapp.collection.list.arraylist.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(23.445);
		al.add('e');
		al.add(34534);
		al.add("Arjun");
		al.add(3453.345);

		for (int i = 0; i < al.size(); i++) {
			Object r = al.get(i);
			System.out.println("using for loop " + r);
		}

		for (Object r : al) {
			System.out.println("using foreach " + r);
		}

		Iterator it = al.iterator();

		while (it.hasNext()) {
			Object r = it.next();
			System.out.println("using Iterator " + r);
		}

		ListIterator li = al.listIterator();

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
