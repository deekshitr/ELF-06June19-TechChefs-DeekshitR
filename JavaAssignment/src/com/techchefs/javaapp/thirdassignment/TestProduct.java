package com.techchefs.javaapp.thirdassignment;

/* USE CASE :
 * String4 is a main test class 
 * to print the product details
 */

//SOLUTION :

public class TestProduct {

	static String[] pNames = { "Cooler", "AC", "Freezer" ,"Iron"};
	static int[] pId = { 101, 102, 103 ,104};
	static int[] pQuant = {10, 18, 15, 20};
	public static void main(String[] args) {

		ArrayProduct a = new ArrayProduct();
		Product[] s = new Product[pNames.length];
		//Product[] s1 = new Product[pId.length];
		for (int i = 0; i < s.length; i++) {
			s[i] = new Product();
			s[i].setProductName(pNames[i]);
			s[i].setProductId(pId[i]);
			s[i].setProductquantity(pQuant[i]);
			
		}
		
		a.store(s);
	} //end of main

}//end of class
