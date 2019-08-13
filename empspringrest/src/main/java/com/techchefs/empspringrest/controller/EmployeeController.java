package com.techchefs.empspringrest.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techchefs.empspringrest.beans.EmployeeAddressInfoBean;
import com.techchefs.empspringrest.beans.EmployeeEducationInfoBean;
import com.techchefs.empspringrest.beans.EmployeeExperienceInfoBean;
import com.techchefs.empspringrest.beans.EmployeeInfoBean;
import com.techchefs.empspringrest.beans.EmployeeOtherInfoBean;
import com.techchefs.empspringrest.common.EMPConstants;
import com.techchefs.empspringrest.dao.EmployeeDAO;

import lombok.extern.java.Log;

@Log
//@Controller
@RestController
@RequestMapping("/employee-portal")
@PropertySource(EMPConstants.PROPERTY_CLASS_PATH)
public class EmployeeController {
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
	public boolean createEmployee(EmployeeInfoBean employeeInfoBean) {

		EmployeeInfoBean managerInfoBean = dao.getEmployeeInfo(1);
		employeeInfoBean.setManagerId(managerInfoBean);

		return dao.createEmployeeInfo(employeeInfoBean);

	}

	@PutMapping("/updateemployee") 
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {

		return dao.updateEmployeeInfo(employeeInfoBean);
	}

	@GetMapping(path = "/getemployee", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public EmployeeInfoBean getEmployee(@RequestParam String empSearch, HttpSession httpSession,
			@Value(value = "${dbInteractionType}") String dbInteractionType) {

		return dao.getEmployeeInfo(empSearch);
	}

	@GetMapping(path="/getallsearchedemployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeeInfoBean> getAllSearchedEmployee(@RequestParam String empSearchValue) {

		EmployeeInfoBean empBean = new EmployeeInfoBean();
		empBean.setId(Integer.parseInt(empSearchValue));

		return dao.getMatchedEmployeeInfo(empSearchValue);
	}

	@GetMapping(path="/getallemployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeeInfoBean> getAllEmployee() {

		return dao.getAllEmployeeInfo();
	}

	@DeleteMapping("/deleteemployee")
	//@ResponseBody
	public boolean deleteEmployee(@RequestParam String empId) {

		EmployeeInfoBean empBean = new EmployeeInfoBean();
		empBean.setId(Integer.parseInt(empId));

		return dao.deleteEmployeeInfo(empId);
	}
}
