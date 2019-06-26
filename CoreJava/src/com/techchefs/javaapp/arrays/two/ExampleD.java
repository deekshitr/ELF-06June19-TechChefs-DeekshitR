package com.techchefs.javaapp.arrays.two;

public class ExampleD {
	 public static void main(String[] args) {
		int[] arr1 = {4,6,8,2,9};
		double[] arr2 = {4.6,6.2,8.7,2.23,9.56};
		String[] arr3 = {"Eshwar", "tarun", "deepak", "karan"};
		
		for(int ele: arr1) {
			System.out.println(ele);
		}
		for(double ele: arr2) {
			System.out.println(ele);
		}
		for(String ele: arr3) {
			System.out.println(ele);
		}
	}
}
