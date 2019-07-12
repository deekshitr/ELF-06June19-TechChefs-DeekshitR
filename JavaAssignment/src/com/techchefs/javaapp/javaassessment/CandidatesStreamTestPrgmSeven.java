package com.techchefs.javaapp.javaassessment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/* USE CASE :
 * CandidatesStreamTestPrgmSeven is a Bean main class 
 *have arraylist filtered for female Topper using stream and Comparator
 * 
 */
@Log
public class CandidatesStreamTestPrgmSeven {
	
	static Comparator<CandidatesBeanPrgmSeven> comp = (i,j)->{
		Double per1 = i.getPercent();
		Double per2 = j.getPercent();
		
		return per1.compareTo(per2) ;
				 
	};
	
	private static CandidatesBeanPrgmSeven getTopper(ArrayList<CandidatesBeanPrgmSeven> candList) {
		
		List<CandidatesBeanPrgmSeven> filteredList = candList.stream().filter(f->f.getGender().equals("Female")).collect(Collectors.toList());
		CandidatesBeanPrgmSeven maxPercent = filteredList.stream().max(comp).get();
		return maxPercent;
		
	}//end of method
	
	public static void main(String[] args) {
		ArrayList<CandidatesBeanPrgmSeven> arrayList = new ArrayList<CandidatesBeanPrgmSeven>();
		
		arrayList.add(new CandidatesBeanPrgmSeven(1,"Nistha","Female",87.80));
		arrayList.add(new CandidatesBeanPrgmSeven(5,"Rahul","Male",67.97));
		arrayList.add(new CandidatesBeanPrgmSeven(4,"Abhay","Male",83.80));
		arrayList.add(new CandidatesBeanPrgmSeven(2,"Neha","Female",57.38));
		arrayList.add(new CandidatesBeanPrgmSeven(3,"Shweta","Female",66.89));
		
		CandidatesBeanPrgmSeven maxPerFemale = getTopper(arrayList);
		
		log.info("Name is :" + maxPerFemale.getName() + " with " + "Maximum percentage is :" + maxPerFemale.getPercent());
	}//end of main

}//end of class
