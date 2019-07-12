package com.techchefs.javaapp.javaassessment;

import lombok.extern.java.Log;

/* USE CASE :
 * LaysPrgmTwo is a child class 
 *have one method open()
 * 
 */

//SOLUTION :

@Log
public class BingoPrgmTwo extends ChipsPrgmTwo{
	public void open() {
		log.info("This is a Bingo open() method");
	}

}//end of class
