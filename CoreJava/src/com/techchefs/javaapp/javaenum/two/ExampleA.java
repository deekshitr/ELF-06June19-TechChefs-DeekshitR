package com.techchefs.javaapp.javaenum.two;

import lombok.extern.java.Log;

@Log
public class ExampleA {

	public static void main(String[] args) {
		Loan l1 = Loan.HOME;
		
		int constValueHome = l1.getValue();
		log.info("value of home loan: "+constValueHome);
		
		Loan l2 = Loan.PERSONAL;
		
		int constValuePersonal = l2.getValue();
		log.info("value of personal loan: "+constValuePersonal);
		
		Loan l3 = Loan.CAR;
		
		int constValueCar = l3.getValue();
		log.info("value of car loan: "+constValueCar);
		

	}

}
