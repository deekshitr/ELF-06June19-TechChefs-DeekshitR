package com.techchefs.javaapp.collection.list.arraylist.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example3 {

	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(32.3);
		al.add(76.3);
		al.add(5672.3);
		al.add(356562.3);

		for (int i = 0; i < al.size(); i++) {
			Double r = al.get(i);
			System.out.println("for : " + r);
		}

		for (Double r : al) {
			System.out.println("foreach : " + r);
		}

		Iterator<Double> it = al.iterator();

		while (it.hasNext()) {
			Double r = it.next();
			System.out.println("using Iterator " + r);
		}

		ListIterator<Double> li = al.listIterator();

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
