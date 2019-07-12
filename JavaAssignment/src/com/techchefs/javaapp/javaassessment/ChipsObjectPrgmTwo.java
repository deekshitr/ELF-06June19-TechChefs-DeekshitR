package com.techchefs.javaapp.javaassessment;

import lombok.extern.java.Log;

/* USE CASE :
 * ChipsObjectPrgmTwo is a class 
 *have one method recieved() passing the object of chips class
 * 
 */

//SOLUTION :
@Log
public class ChipsObjectPrgmTwo {
	
	public void recieved (ChipsPrgmTwo chips) {
		
		if(chips instanceof kurkurePrgmTwo) {
			log.info("kurkure Instance");
		}else if (chips instanceof BingoPrgmTwo) {
			log.info("Bingo Instance");
		}
		
	}

}
