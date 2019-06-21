package com.techchefs.javaapp.arrays2;

public class Example9 {

	public static void main(String[] args) {
		int[] a = {5,6,2,1,4};
		int[] b= {30,40,50,60,70,80};
		
		System.arraycopy(a, 1, b, 2, 2);
		
		for (int k=0;k<b.length;k++) {
			System.out.println(b[k]);
		}

	}

}
