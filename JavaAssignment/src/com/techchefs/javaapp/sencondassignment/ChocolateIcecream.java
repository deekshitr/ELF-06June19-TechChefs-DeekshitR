package com.techchefs.javaapp.sencondassignment;

import lombok.extern.java.Log;

/* USE CASE :
 * ChocolateIcecream is a child class of Icecream class
 */

//SOLUTION :

@Log
public class ChocolateIcecream extends Icecream{

	void eat()
	{
		log.info("Eating chocolate icecream");
	}
	
	void open()
	{
		log.info("Opening chocolate icecream");
	}
}//end of class
