package com.techchefs.javaapp.javaassessment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/* USE CASE :
	 * ProductMainPrgmNine is a main class to sort the product by ID and by Range in an arraylist using STREAM
	 * and lambda expression
	 */

	//SOLUTION :
@Log
public class ProductMainPrgmNine {
	static Comparator<ProductPrgmNine> compbyId = (i,j)->{
		Integer Id1 = i.getPId();
		Integer Id2 = j.getPId();
		return Id1.compareTo(Id2);
	};
	
	static Comparator<ProductPrgmNine> compbyRange = (i,j)->{
		Double ran1 = i.getRange();
		Double ran2 = j.getRange();
		return ran1.compareTo(ran2);
	};
	
	public static void main(String[] args) {
				
		ArrayList<ProductPrgmNine> arrayList = new ArrayList<ProductPrgmNine>();
		
		arrayList.add(new ProductPrgmNine(3, "TV", 54000));
		arrayList.add(new ProductPrgmNine(5, "Fridge", 34000));
		arrayList.add(new ProductPrgmNine(1, "AC", 40000));
		arrayList.add(new ProductPrgmNine(2, "Heater", 14000));
		arrayList.add(new ProductPrgmNine(4, "Table", 4000));
		
		List<ProductPrgmNine> lstById = arrayList.stream().sorted(compbyId).collect(Collectors.toList());
		List<ProductPrgmNine> lstByRange = arrayList.stream().sorted(compbyRange).collect(Collectors.toList());
		
		log.info("List of product sorted by ID :" + lstById);
		log.info("***************************************************************");
		log.info("List of product sorted by Range :" + lstByRange);
	
	}//end of main

}//end of class
