package com.techchefs.javaapp.arrays.two;

public class ExampleG {

	public static void main(String[] args) {
		int[] a = {5,6,2,1,4};
		int[] b= {30,40,50,60,70,80};
		int arrStart = 2;
		int arrGivenNum = 2;
		int l=0;
		
		for (int i=0;i<b.length;i++) {
			
			if (i>=arrStart) {
				b[i] = a[l++];
			}
			if (l==arrGivenNum) {
				break;
			}
		}
		
		for (int k=0;k<b.length;k++) {
			System.out.println(b[k]);
		}

	}

}
