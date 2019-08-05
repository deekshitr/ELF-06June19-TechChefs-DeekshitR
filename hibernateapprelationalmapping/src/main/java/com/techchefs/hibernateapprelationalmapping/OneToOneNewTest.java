package com.techchefs.hibernateapprelationalmapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.techchefs.hibernateapprelationalmapping.dto.EmployeeAddressInfoBean;
import com.techchefs.hibernateapprelationalmapping.dto.EmployeeAddressInfoPKBean;
import com.techchefs.hibernateapprelationalmapping.dto.EmployeeEducationInfoBean;
import com.techchefs.hibernateapprelationalmapping.dto.EmployeeEducationInfoPKBean;
import com.techchefs.hibernateapprelationalmapping.dto.EmployeeExperienceInfoBean;
import com.techchefs.hibernateapprelationalmapping.dto.EmployeeExperienceInfoPKBean;
import com.techchefs.hibernateapprelationalmapping.dto.EmployeeInfoBean;
import com.techchefs.hibernateapprelationalmapping.dto.EmployeeOtherInfoBean;
import com.techchefs.hibernateapprelationalmapping.dto.TrainingInfoBean;
import com.techchefs.hibernateapprelationalmapping.impl.HibernateImpl;

import lombok.extern.java.Log;

@Log
public class OneToOneNewTest {

	public static void main(String[] args) throws Exception {

		/*
		 * SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); Date
		 * joiningDate = dateFormat.parse("2019-02-17"); Date dob =
		 * dateFormat.parse("1995-04-17");
		 * 
		 * 
		 * EmployeeInfoBean empInfo = new EmployeeInfoBean(); empInfo.setId(1);
		 * empInfo.setName("Kalpana"); empInfo.setAge(38); empInfo.setGender("F");
		 * empInfo.setSalary(62999); empInfo.setPhone(9922244227L);
		 * empInfo.setJoiningDate(joiningDate); empInfo.setAccNum(2299115599L);
		 * empInfo.setEmail("b@gmail.com"); empInfo.setDesignation("Software Endineer");
		 * empInfo.setDob(dob); empInfo.setDepartmentId(2); empInfo.setManagerId(1);
		 * 
		 * EmployeeOtherInfoBean empOtherInfo = new EmployeeOtherInfoBean();
		 * 
		 * empOtherInfo.setPan("JAPEN2049O"); empOtherInfo.setMarried(true);
		 * empOtherInfo.setBloodGrp("A+Ove"); empOtherInfo.setChallenged(false);
		 * empOtherInfo.setEmergencyContactName("Gautham");
		 * empOtherInfo.setEmergencyContactNumber(9922884477L);
		 * empOtherInfo.setNationality("Indian"); empOtherInfo.setReligion("Hindu");
		 * empOtherInfo.setFatherName("Rahul"); empOtherInfo.setMotherName("Lakshmi");
		 * empOtherInfo.setSpouseName("Jasmine"); empOtherInfo.setPassport(7722993377L);
		 * empOtherInfo.setAdhar(2299338844L);
		 * 
		 * empOtherInfo.setInfoBean(empInfo);
		 * 
		 * EmployeeAddressInfoPKBean empAddressPKBean1 = new
		 * EmployeeAddressInfoPKBean(); empAddressPKBean1.setInfoBean(empInfo);
		 * empAddressPKBean1.setAddressType("T");
		 * 
		 * EmployeeAddressInfoPKBean empAddressPKBean2 = new
		 * EmployeeAddressInfoPKBean(); empAddressPKBean2.setInfoBean(empInfo);
		 * empAddressPKBean2.setAddressType("P");
		 * 
		 * 
		 * EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
		 * addressInfoBean1.setEmpAddressPKBean(empAddressPKBean1);
		 * addressInfoBean1.setAddress1("abc");
		 * 
		 * EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		 * addressInfoBean2.setEmpAddressPKBean(empAddressPKBean2);
		 * addressInfoBean2.setAddress2("xyz");
		 * 
		 * EmployeeEducationInfoPKBean empEducationPKBean1 = new
		 * EmployeeEducationInfoPKBean(); empEducationPKBean1.setInfoBean(empInfo);
		 * empEducationPKBean1.setEducationType("Graduation");
		 * 
		 * EmployeeEducationInfoPKBean empEducationPKBean2 = new
		 * EmployeeEducationInfoPKBean(); empEducationPKBean2.setInfoBean(empInfo);
		 * empEducationPKBean2.setEducationType("correspondence");
		 * 
		 * EmployeeEducationInfoBean empEducationBean1 = new
		 * EmployeeEducationInfoBean();
		 * empEducationBean1.setEmpEducationInfoPKBean(empEducationPKBean1);
		 * empEducationBean1.setYop("2016");
		 * 
		 * EmployeeEducationInfoBean empEducationBean2 = new
		 * EmployeeEducationInfoBean();
		 * empEducationBean2.setEmpEducationInfoPKBean(empEducationPKBean2);
		 * empEducationBean2.setYop("2014");
		 * 
		 * EmployeeExperienceInfoPKBean empExperiencePKBean1 = new
		 * EmployeeExperienceInfoPKBean(); empExperiencePKBean1.setInfoBean(empInfo);
		 * empExperiencePKBean1.setCompanyName("TCS");
		 * 
		 * EmployeeExperienceInfoPKBean empExperiencePKBean2 = new
		 * EmployeeExperienceInfoPKBean(); empExperiencePKBean2.setInfoBean(empInfo);
		 * empExperiencePKBean2.setCompanyName("Infosys");
		 * 
		 * EmployeeExperienceInfoBean empExperienceBean1 = new
		 * EmployeeExperienceInfoBean();
		 * empExperienceBean1.setEmpExperienceInfoPKBean(empExperiencePKBean1);
		 * empExperienceBean1.setDesignation("SE");
		 * 
		 * EmployeeExperienceInfoBean empExperienceBean2 = new
		 * EmployeeExperienceInfoBean();
		 * empExperienceBean2.setEmpExperienceInfoPKBean(empExperiencePKBean2);
		 * empExperienceBean2.setDesignation("Tester");
		 * 
		 * HibernateImpl impl = new HibernateImpl(); impl.createEmployee(empInfo,
		 * empOtherInfo, Arrays.asList(addressInfoBean1,addressInfoBean2),
		 * Arrays.asList(empEducationBean1,empEducationBean2),
		 * Arrays.asList(empExperienceBean1,empExperienceBean2));
		 */
			
		EmployeeInfoBean empInfo1 = new EmployeeInfoBean();
		empInfo1.setId(1);
		empInfo1.setName("Eshwar");
		empInfo1.setDesignation("SD");
		
		EmployeeInfoBean empInfo2 = new EmployeeInfoBean();
		empInfo2.setId(2);
		empInfo2.setName("Eshwar");
		empInfo2.setDesignation("Tester");
		
		EmployeeInfoBean empInfo3 = new EmployeeInfoBean();
		empInfo3.setId(3);
		empInfo3.setName("Eshwar");
		empInfo3.setDesignation("Designer");
		
		TrainingInfoBean trainingInfoBean = new TrainingInfoBean();
		trainingInfoBean.setCourseId(101);
		trainingInfoBean.setCourseName("JAVA");
		trainingInfoBean.setCourseType("Development");
		trainingInfoBean.setDuration(3);
		
		trainingInfoBean.setInfoBean(Arrays.asList(empInfo1, empInfo2, empInfo3));
		HibernateImpl impl = new HibernateImpl();
		impl.createTraining(trainingInfoBean);
	}

}
