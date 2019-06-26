package com.techchefs.javaapp.collection.list.arraylist.one;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(23.445);
		al.add('e');
		al.add(34534);
		al.add("Arjun");
		al.add(3453.345);

		System.out.println("only al " + al);

		ListIterator li = al.listIterator(al.size());

		while (li.hasPrevious()) {
			Object r = li.previous();
			System.out.println("previous using List Iterator " + r);
		}

	}

}
