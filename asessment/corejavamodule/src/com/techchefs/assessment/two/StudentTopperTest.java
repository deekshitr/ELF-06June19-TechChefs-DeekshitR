package com.techchefs.assessment.two;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class StudentTopperTest {
	static Logger log = Logger.getLogger("StudentTopperTest");
	
	static  Comparator<Student> c = (i,j) -> {
		if(i.getPercentage() > j.getPercentage()) {
			return 1;
		} else if(i.getPercentage() < j.getPercentage()) {
			return -1;
		} else {
			return 0;
		}
	};
	
	static Student getTopper(List<Student> maleStud) {
		return maleStud.stream().max(c).get();
	}
			
			
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Rakesh");
		s1.setGender('M');
		s1.setPercentage(87.23);
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Umesh");
		s2.setGender('M');
		s2.setPercentage(57.34);
		
		Student s3 = new Student();
		s3.setId(3);
		s3.setName("Ramya");
		s3.setGender('F');
		s3.setPercentage(67.43);
		
		Student s4 = new Student();
		s4.setId(4);
		s4.setName("Priya");
		s4.setGender('F');
		s4.setPercentage(78.35);
		
		Student s5 = new Student();
		s5.setId(5);
		s5.setName("Eshwar");
		s5.setGender('M');
		s5.setPercentage(62.45);
		
		Student s6 = new Student();
		s6.setId(5);
		s6.setName("Eshwar");
		s6.setGender('M');
		s6.setPercentage(62.45);
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		Predicate<Student> p1 = (s)->{
			if(s.getGender()=='M') {
				return true;
			} else {
				return false;
			}
		};
		
		Predicate<Student> p2 = (s)->{
			if(s.getGender()=='F') {
				return true;
			} else {
				return false;
			}
		};
	
		List<Student> maleStud = al.stream().filter(p1).collect(Collectors.toList());
		
		List<Student> femaleStud = al.stream().filter(p2).collect(Collectors.toList());
		
		Student mtopper = getTopper(maleStud);
		
		Student ftopper = getTopper(femaleStud);
		
		log.info("Topper in Male Student: "+mtopper.getName()+" with percentage "+mtopper.getPercentage());
		
		log.info("Topper in Female Student: "+ftopper.getName()+" with percentage "+ftopper.getPercentage());
		

	}

}
