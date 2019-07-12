package com.techchefs.javaapp.fifthassignment;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

/* USE CASE :
 * Product is a Bean class having product's details
 *  
 */

//SOLUTION :
@Data
@NoArgsConstructor
public class ProductBean {
	
	String name;
	int cost;
	double rating;

}//end of class
