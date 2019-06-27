package com.techchefs.javaapp.basic.one;

public class Example17 {
	
	static int factorial (int n) {
		int f=1;
		for (int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
	
	static int recurssionFact (int n) {
		if (n==0) {
			return 1;
		}
		
		return n*recurssionFact(n-1);
	}
	public static void main(String[] args) {
		int f1 = factorial(5);
		int f2 = recurssionFact(5);
		System.out.println("f1 : "+f1);
		System.out.println("f2 : "+f2);
	}

}
