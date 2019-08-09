package com.techchefs.empspringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class HomeController {
	
	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;
	
	/*
	 * @GetMapping("/validate1") public String validateSession1(HttpSession
	 * httpSession, ModelMap modelMap,
	 * 
	 * @RequestParam String url, @Value(value = "${loginSessionErrorMsg}") String
	 * sessionErrMsg) { if (httpSession.isNew()) {
	 * modelMap.addAttribute("loginErrMsg", sessionErrMsg);
	 * httpSession.invalidate(); return "login"; } return
	 * "forward:/employee-portal/"+url; }
	 * 
	 * @GetMapping("/validate2") public String validateSession2(HttpServletRequest
	 * req, ModelMap modelMap,
	 * 
	 * @RequestParam String url, @Value(value = "${loginSessionErrorMsg}") String
	 * sessionErrMsg) { if (req.getSession(false) == null) {
	 * modelMap.addAttribute("loginErrMsg", sessionErrMsg); }
	 * 
	 * return "login"; }
	 */
	
	
	@PostMapping("/updateemployee")
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
			modelMap.addAttribute("editEmpSuccess", "Edit SuccessFull");
			
			return "redirect:/employee-portal/validate/home-page";
			
		} else {
			modelMap.addAttribute("editEmpError", "Edit UnSuccessFull");
			
			return "redirect:/employee-portal/validate/home-page";
		}
		
		

	}
	
}
