package com.techchefs.javaapp.basic.one;

public class Example6 {

	public static void main(String[] args) {
		int carPrice=570000;
		double rto=14.26;
		double insurence=9.76;
		double rtoCharge = (carPrice*rto)/100;
		double insurenceCharge = (carPrice*insurence)/100;
		double total = carPrice+rtoCharge+insurenceCharge;
		System.out.println("Ex-showroom price : "+carPrice);
		System.out.println("RTO : "+rtoCharge);
		System.out.println("Insurance : "+insurenceCharge);
		System.out.println("On road price : "+ total);
	}

}
