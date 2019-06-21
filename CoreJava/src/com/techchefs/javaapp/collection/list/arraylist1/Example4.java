package com.techchefs.javaapp.collection.list.arraylist1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		al.add("abc4");

		for (int i = 0; i < al.size(); i++) {
			String r = al.get(i);
			System.out.println("for : " + r);
		}

		for (String r : al) {
			System.out.println("foreach : " + r);
		}

		Iterator<String> it = al.iterator();

		while (it.hasNext()) {
			String r = it.next();
			System.out.println("using Iterator " + r);
		}

		ListIterator<String> li = al.listIterator();

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
