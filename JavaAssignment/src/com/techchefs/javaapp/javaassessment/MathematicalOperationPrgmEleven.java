package com.techchefs.javaapp.javaassessment;

/* USE CASE :
 * MathematicalOperationPrgmEleven is a mathematical class 
 *have three methods to calculate SI,percentage,factoriaql.
 * 
 */

//SOLUTION :
public class MathematicalOperationPrgmEleven {

	public double si;
	public double percent;
	public double fact = 1;

	public double calInterest(int principal,double rate,int time) {

		return si = (principal * rate * time) / 100;
	}

	public double calPercent(int marks1,int marks2,int marks3) {

		return si = (marks1 + marks2 + marks3)/3.0 ;
	}

	public double calFactorial(int num) {
		
		for(int i=1 ; i<=num ; i++) {
			fact = fact*i;
		}

		return fact;
	}

}//end of class
