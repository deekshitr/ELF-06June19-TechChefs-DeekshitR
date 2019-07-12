package com.techchefs.javaapp.fifthassignment;

import java.util.Comparator;

/* USE CASE :
 * MobileProduct is a class to compare products by the price 
 *  
 */

//SOLUTION :
public class MobileProduct implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		
		Integer p1 = o1.price;
		Integer p2 = o2.price;
		
		return p1.compareTo(p2);
	}	

} //end of class
