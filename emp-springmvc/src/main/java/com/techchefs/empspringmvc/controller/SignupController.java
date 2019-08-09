package com.techchefs.empspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techchefs.empspringmvc.beans.EmployeeAddressInfoBean;
import com.techchefs.empspringmvc.beans.EmployeeEducationInfoBean;
import com.techchefs.empspringmvc.beans.EmployeeExperienceInfoBean;
import com.techchefs.empspringmvc.beans.EmployeeInfoBean;
import com.techchefs.empspringmvc.beans.EmployeeOtherInfoBean;
import com.techchefs.empspringmvc.common.EMPConstants;
import com.techchefs.empspringmvc.dao.EmployeeDAO;
import com.techchefs.empspringmvc.dao.EmployeeDAOFactory;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/employee-portal")
@PropertySource(EMPConstants.PROPERTY_CLASS_PATH)
public class SignupController {

	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	private Object manager_Id;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@PostMapping("/createemployee")
	public String signup(EmployeeInfoBean employeeInfoBean, ModelMap modelMap, int manager_Id) {

		for (EmployeeEducationInfoBean employeeEducationInfoBean : employeeInfoBean.getEducationInfoBean()) {
			employeeEducationInfoBean.getEmpEducationInfoPKBean().setInfoBean(employeeInfoBean);
		}

		for (EmployeeAddressInfoBean addressInfoBean : employeeInfoBean.getAddressInfoBean()) {
			addressInfoBean.getEmpAddressPKBean().setInfoBean(employeeInfoBean);
		}

		for (EmployeeExperienceInfoBean employeeExperienceInfoBean :  employeeInfoBean.getExpirenceInfoBean()) {
			employeeExperienceInfoBean.getEmpExperienceInfoPKBean().setInfoBean(employeeInfoBean);
		}

		// EmployeeDAO dao = EmployeeDAOFactory.getInstance(dbInteractionType);

		EmployeeOtherInfoBean otherInfoBean = employeeInfoBean.getOtherInfoBean();
		otherInfoBean.setInfoBean(employeeInfoBean);		
		
		EmployeeInfoBean managerInfoBean = dao.getEmployeeInfo(manager_Id);
		employeeInfoBean.setManagerId(managerInfoBean);
		
		boolean empSave = dao.createEmployeeInfo(employeeInfoBean);
		log.info("empSave" + empSave);
		if (empSave) {
			modelMap.addAttribute("signupSuccessMsg", "SignUp SuccessFull");
		} else {
			modelMap.addAttribute("signupErrMsg", "SignUp UnSuccessFull");
		}
		return "signup";

	}

}
