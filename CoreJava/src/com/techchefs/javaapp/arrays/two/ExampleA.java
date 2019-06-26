package com.techchefs.javaapp.arrays.two;

import java.util.Arrays;

public class ExampleA {

	public static void main(String[] args) {
//		double array[] = {4,2,6,8,9};
//		int array[] = {6.6,2.3,8.6,4.1};
//		String array[] = {"Raksha", "Anand", "Priyanka", "Suresh"};
		
		Integer[] array = {5,4,9,1,3};
		
//		double temp;
		
//	   for (int i = 1; i < array.length; i++) {
//	    for (int j = i; j > 0; j--) {
//	     if (array[j] < array [j - 1]) {
//	      temp = array[j];
//	      array[j] = array[j - 1];
//	      array[j - 1] = temp;
//	     }
//	    }
//	   }
		
//		for (int i = 0; i < array.length; i++) {
//	        for (int j = i + 1; j < array.length; j++) {
//	        	double tmp;
//	            if (array[i] > array[j]) {
//	            	tmp = array[i];
//	                array[i] = array[j];
//	                array[j] = tmp;
//	            }
//	        }
//	    }
		
//	   Arrays.sort(array);
		Arrays.sort(array);
	   
	   for (int i = 0; i < array.length; i++) {
	     System.out.println(array[i]);
	   }

	}

}
