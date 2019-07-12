package com.techchefs.javaapp.fifthassignment;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.extern.java.Log;
/* USE CASE :
 * ArrayListMainPrgmThree is a main method class to store the product's
 *  detail into a arraylist and display them.
 */

//SOLUTION :
@Log
public class ArrayListMainPrgmThree {
	
	/*	It's a main method to call product class 
	 *  and display using arraylist
	 */

	public static void main(String[] args) {
		
		ProductBean p1 = new ProductBean();
		p1.setName("TV");
		p1.setCost(30000);
		p1.setRating(4.1);
		
		ProductBean p2 = new ProductBean();
		p2.setName("Freez");
		p2.setCost(36000);
		p2.setRating(4.1);
		
		ProductBean p3 = new ProductBean();
		p3.setName("Heater");
		p3.setCost(18000);
		p3.setRating(4.1);
		
		ProductBean p4 = new ProductBean();
		p4.setName("Microwave");
		p4.setCost(15000);
		p4.setRating(4.1);
		
		ProductBean p5 = new ProductBean();
		p5.setName("AC");
		p5.setCost(25000);
		p5.setRating(4.1);
		
		ArrayList<ProductBean> al = new ArrayList<ProductBean>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		
		Iterator<ProductBean> i = al.iterator();
		
		while(i.hasNext()) {
			ProductBean p = i.next();
			
			if(p.cost<20000) {
				log.info("******************Product details*************");
				log.info("Product name is :" + p.name);
				log.info("Product cost is :" + p.cost);
				log.info("Product rating is :" + p.rating);
			}
			
		}
	}
}
