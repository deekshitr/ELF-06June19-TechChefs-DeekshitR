package com.techchefs.javaapp.arrays2;

import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		
		int[] array = {2,4,8,1};
		
		Arrays.sort(array);
		System.out.println(Arrays.binarySearch(array, 20));
		
	}

}
