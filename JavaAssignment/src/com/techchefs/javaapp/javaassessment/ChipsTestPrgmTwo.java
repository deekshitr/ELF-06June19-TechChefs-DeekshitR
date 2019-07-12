package com.techchefs.javaapp.javaassessment;
/* USE CASE :
 * ChipsTestPrgmTwo is a main class 
 *have one method open()
 * 
 */

//SOLUTION :
public class ChipsTestPrgmTwo {
	public static void main(String[] args) {
		ChipsObjectPrgmTwo child = new ChipsObjectPrgmTwo();
		
		kurkurePrgmTwo kurkure = new kurkurePrgmTwo();
		BingoPrgmTwo bingo = new BingoPrgmTwo();
		
		child.recieved(kurkure);
		//child.recieved(bingo);
		
	}//end of main

}//end of class
