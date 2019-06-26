package com.techchefs.javaapp.arrays.two;

import java.util.Arrays;

public class ExampleB {

	public static void main(String[] args) {
		
		int[] array = {2,4,8,1};
		
		Arrays.sort(array);
		System.out.println(Arrays.binarySearch(array, 20));
		
	}

}
