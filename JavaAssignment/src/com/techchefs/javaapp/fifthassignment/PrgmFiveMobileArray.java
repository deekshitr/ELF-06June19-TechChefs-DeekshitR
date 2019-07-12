package com.techchefs.javaapp.fifthassignment;

import java.util.Iterator;
import java.util.TreeSet;

import lombok.extern.java.Log;

/* USE CASE :
 * PrgmFiveMobileArray is a main method class to call mobile class object 
 *  and store the values in a treeset
 */

//SOLUTION :
@Log
public class PrgmFiveMobileArray {

	public static void main(String[] args) {

		Mobile p1 = new Mobile("Nokia", 15000, "black", 4.1);
		Mobile p2 = new Mobile("Samsung", 25000, "grey", 4.5);
		Mobile p3 = new Mobile("Lenovo", 12000, "Golden", 3.9);
		Mobile p4 = new Mobile("Vivo", 14000, "silver", 3.8);

		MobileProduct mp = new MobileProduct();

		TreeSet<Mobile> ts = new TreeSet<Mobile>(mp);

		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);

		Iterator<Mobile> i = ts.iterator();

		while (i.hasNext()) {
			Mobile p = i.next();

			log.info("******************Mobile details*************");
			log.info("brand is " + p.brand);
			log.info("price is " + p.price);
			log.info("color is " + p.color);
			log.info("rating is " + p.rating);
		}

	}// End Of main
}// End Of class
