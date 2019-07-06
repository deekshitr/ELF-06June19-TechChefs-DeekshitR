package com.techchefs.hibernateapprelationalmapping;

import java.util.Arrays;

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

public class RelationBidirectionalMappingTest {
	public static void main(String[] args) {
		
		EmployeeInfoBean infoBean = new EmployeeInfoBean();
		infoBean.setId(1);
		infoBean.setName("Rahul");
		infoBean.setDesignation("SD");
		
		EmployeeOtherInfoBean otherInfoBean = new EmployeeOtherInfoBean();
		otherInfoBean.setAdhar(23524662345L);
		otherInfoBean.setPan("DJKH456346");
		otherInfoBean.setInfoBean(infoBean);
		
		infoBean.setEmpOtherInfoBean(otherInfoBean);
		
		EmployeeAddressInfoPKBean addressInfoPKBean1 = new EmployeeAddressInfoPKBean();
		addressInfoPKBean1.setAddressType("T");
		addressInfoPKBean1.setInfoBean(infoBean);
		
		EmployeeAddressInfoPKBean addressInfoPKBean2 = new EmployeeAddressInfoPKBean();
		addressInfoPKBean2.setAddressType("P");
		addressInfoPKBean2.setInfoBean(infoBean);
		
		EmployeeAddressInfoBean addressInfoBean1 = new EmployeeAddressInfoBean();
		addressInfoBean1.setEmpAddressPKBean(addressInfoPKBean1);
		addressInfoBean1.setAddress1("abc");
		addressInfoBean1.setAddress2("def");
		
		EmployeeAddressInfoBean addressInfoBean2 = new EmployeeAddressInfoBean();
		addressInfoBean2.setEmpAddressPKBean(addressInfoPKBean2);
		addressInfoBean2.setAddress1("abc");
		addressInfoBean2.setAddress2("def");
		
		infoBean.setAddressInfoBean(Arrays.asList(addressInfoBean1, addressInfoBean2));
		
		EmployeeEducationInfoPKBean educationInfoPKBean1 = new EmployeeEducationInfoPKBean();
		educationInfoPKBean1.setInfoBean(infoBean);
		educationInfoPKBean1.setEducationType("Graduate");
		
		EmployeeEducationInfoPKBean educationInfoPKBean2 = new EmployeeEducationInfoPKBean();
		educationInfoPKBean2.setInfoBean(infoBean);
		educationInfoPKBean2.setEducationType("Post Graduate");
		
		EmployeeEducationInfoBean educationInfoBean1 = new EmployeeEducationInfoBean();
		educationInfoBean1.setEmpEducationInfoPKBean(educationInfoPKBean1);
		educationInfoBean1.setYop("2016");
		
		EmployeeEducationInfoBean educationInfoBean2 = new EmployeeEducationInfoBean();
		educationInfoBean2.setEmpEducationInfoPKBean(educationInfoPKBean2);
		educationInfoBean2.setYop("2015");
		
		infoBean.setEducationInfoBean(Arrays.asList(educationInfoBean1, educationInfoBean2));
		
		EmployeeExperienceInfoPKBean experienceInfoPKBean1 = new EmployeeExperienceInfoPKBean();
		experienceInfoPKBean1.setInfoBean(infoBean);
		experienceInfoPKBean1.setCompanyName("TCS");
		
		EmployeeExperienceInfoPKBean experienceInfoPKBean2 = new EmployeeExperienceInfoPKBean();
		experienceInfoPKBean2.setInfoBean(infoBean);
		experienceInfoPKBean2.setCompanyName("Infosys");
		
		EmployeeExperienceInfoBean experienceInfoBean1 = new EmployeeExperienceInfoBean();
		experienceInfoBean1.setEmpExperienceInfoPKBean(experienceInfoPKBean1);
		experienceInfoBean1.setDesignation("SE");
		
		EmployeeExperienceInfoBean experienceInfoBean2 = new EmployeeExperienceInfoBean();
		experienceInfoBean2.setEmpExperienceInfoPKBean(experienceInfoPKBean2);
		experienceInfoBean2.setDesignation("Tester");
		
		infoBean.setExpirenceInfoBean(Arrays.asList(experienceInfoBean1, experienceInfoBean2));

		TrainingInfoBean trainingInfoBean1 = new TrainingInfoBean();
		trainingInfoBean1.setInfoBean(infoBean);
		
		
		HibernateImpl impl = new HibernateImpl();
		impl.createEmployee(infoBean);
	}
}
