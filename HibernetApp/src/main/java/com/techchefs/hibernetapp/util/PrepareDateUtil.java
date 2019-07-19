package com.techchefs.hibernetapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.techchefs.hibernetapp.onetoone.EmployeeInfoBean;
import com.techchefs.hibernetapp.onetoone.EmployeeOtherInfoBean;

public class PrepareDateUtil {
	
	private PrepareDateUtil() {};
	
	public static EmployeeInfoBean prepareData(int id) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date joiningDate =  dateFormat.parse("2019-02-17");
		Date dob =  dateFormat.parse("1995-04-17");
		
		
		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		empInfo.setId(id);
		empInfo.setName("Kalpana");
		empInfo.setAge(38);
		empInfo.setGender("F");
		empInfo.setSalary(62999);
		empInfo.setPhone(9922244227L);
		empInfo.setJoiningDate(joiningDate);
		empInfo.setAccNum(2299115599L);
		empInfo.setEmail("b@gmail.com");
		empInfo.setDesignation("Software Endineer");
		empInfo.setDob(dob);
		empInfo.setDepartmentId(2);
		empInfo.setManagerId(1);
		
		EmployeeOtherInfoBean empOtherInfo = new EmployeeOtherInfoBean();
		
		empOtherInfo.setId(id);
		empOtherInfo.setPan("JAPEN2049O");
		empOtherInfo.setMarried(true);
		empOtherInfo.setBloodGrp("A+Ove");
		empOtherInfo.setChallenged(false);
		empOtherInfo.setEmergencyContactName("Gautham");
		empOtherInfo.setEmergencyContactNumber(9922884477L);
		empOtherInfo.setNationality("Indian");
		empOtherInfo.setReligion("Hindu");
		empOtherInfo.setFatherName("Rahul");
		empOtherInfo.setMotherName("Lakshmi");
		empOtherInfo.setSpouseName("Jasmine");
		empOtherInfo.setPassport(7722993377L);
		empOtherInfo.setAdhar(2299338844L);
		
		empInfo.setSetOtherInfo(empOtherInfo);
		return empInfo;
		
	}
}
