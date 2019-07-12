package com.techchefs.javaapp.javaassessment;
/* USE CASE :
 * CandidatesBeanPrgmSeven is a Bean class 
 *have candidates details
 * 
 */

import lombok.AllArgsConstructor;
import lombok.Data;

//SOLUTION :
@Data
@AllArgsConstructor
public class CandidatesBeanPrgmSeven {
	private int id;
	private String name;
	private String Gender;
	private double percent;

}
