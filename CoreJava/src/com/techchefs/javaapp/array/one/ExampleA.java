package com.techchefs.javaapp.array.one;

public class ExampleA {

	public static void main(String[] args) {
		int[] a1 = new int[4];
		
		a1[0] = 5;
		a1[1] = 7;
		a1[2] = 10;
		a1[3] = 2;
		
		for (int i = 0; i<a1.length; i++) {
				System.out.println("int a1[i] "+ a1[i]);
		}
		
		double[] a2 = new double[4];
		
		a2[0] = 52.34;
		a2[1] = 74.45;
		a2[2] = 10.345;
		a2[3] = 27.345;
		
		for (int i = 0; i<a2.length; i++) {
				System.out.println("double a2[i] "+ a2[i]);
		}
		
		char[] a3 = new char[6];
		
		a3[0] = 'f';
		a3[1] = 'y';
		a3[2] = 't';
		a3[3] = 'j';
		a3[4] = 'k';
		a3[5] = 'm';
		
		for (int i = 0; i<a3.length; i++) {
				System.out.println("double a3[i] "+ a3[i]);
		}
		
		String[] a4 = new String[5];
		
		a4[0] = "raghu";
		a4[1] = "anand";
		a4[2] = "ravi";
		a4[3] = "asha";
		a4[4] = "nisha";
		
		for (int i = 0; i<a4.length; i++) {
				System.out.println("double a4[i] "+ a4[i]);
		}
		
		int[] a5 = {4,5,74,3,78,43};
		
		for (int i = 0; i<a5.length; i++) {
				System.out.println("double a5[i] "+ a5[i]);
		}
		
		char[] a6 = {'d','i','v','y','a'};
		
		for (int i = 0; i<a6.length; i++) {
				System.out.print(a6[i]);
		}
		
		int[] a7 = {4,5,74,3,78,43};
		
		for (int i = a7.length-1; i>=0; i--) {
				System.out.println("int a7[i] "+ a7[i]);
		}
		
		String s1 = new String("re");
		
	}

}
