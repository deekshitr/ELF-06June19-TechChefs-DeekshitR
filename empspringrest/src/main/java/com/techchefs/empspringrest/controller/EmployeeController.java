package com.techchefs.empspringrest.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
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
import org.springframework.web.bind.annotation.RequestBody;
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

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@PostMapping(path = "/createemployee", produces = { MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean employeeInfoBean, HttpServletRequest request) {

		EmployeeResponse response = new EmployeeResponse();

		log.info("employeeInfoBean" + employeeInfoBean);

		if (request.getSession(false) != null) {

			EmployeeInfoBean managerInfoBean = dao.getEmployeeInfo(employeeInfoBean.getManagerId().getId());
			employeeInfoBean.setManagerId(managerInfoBean);

			if (dao.createEmployeeInfo(employeeInfoBean)) {
				response.setStatusCode(201);
				response.setMessage("Insertion Successfull");
				response.setDescription("Employee details added to the database");
			} else {
				response.setStatusCode(301);
				response.setMessage("Insertion failed");
				response.setDescription("Failed to add Employee details");
			}

		} else {

			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Unauthorized access!!! Please login");
		}

		return response;
	}

	@PutMapping(path = "/updateemployee", produces = { MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean employeeInfoBean, HttpServletRequest request) {

		EmployeeResponse response = new EmployeeResponse();

		if (request.getSession(false) != null) {

			if (dao.updateEmployeeInfo(employeeInfoBean)) {
				response.setStatusCode(201);
				response.setMessage("Update Successfull");
				response.setDescription("Employee details added to the database");
			} else {
				response.setStatusCode(301);
				response.setMessage("Update failed");
				response.setDescription("Failed to update Employee details");
			}

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Unauthorized access!!! Please login");
		}

		return response;
	}

	@GetMapping(path = "/getemployee", produces = { MediaType.APPLICATION_JSON_VALUE })
	public EmployeeResponse getEmployee(@RequestParam String empSearch, HttpSession httpSession,
			@Value(value = "${dbInteractionType}") String dbInteractionType, HttpServletRequest request) {

		EmployeeResponse response = new EmployeeResponse();

		if (request.getSession(false) != null) {

			if (dao.getEmployeeInfo(empSearch) != null) {
				response.setStatusCode(201);
				response.setMessage("Successfull");
				response.setDescription("Employee details fetched from the database");
			} else {
				response.setStatusCode(301);
				response.setMessage("failed");
				response.setDescription("Failed to fetch Employee details");
			}

		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Unauthorized access!!! Please login");
		}

		return response;
	}

	@GetMapping(path = "/getallsearchedemployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllSearchedEmployee(@RequestParam String empSearchValue, HttpServletRequest request) {

		EmployeeResponse response = new EmployeeResponse();

		if (request.getSession(false) != null) {

			EmployeeInfoBean empBean = new EmployeeInfoBean();
			empBean.setId(Integer.parseInt(empSearchValue));

			List<EmployeeInfoBean> empInfoBeans = dao.getMatchedEmployeeInfo(empSearchValue);

			if (empInfoBeans != null) {

				response.setStatusCode(201);
				response.setMessage("Successfull");
				response.setDescription("Employee data found successfully");
				response.setEmpInfoBeans(empInfoBeans);

			} else {
				response.setStatusCode(301);
				response.setMessage("Failure");
				response.setDescription("Employee data not found");
			}

		} else {

			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Unauthorized access!!! Please login");

		}

		return response;
	}

	@GetMapping(path = "/getallemployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(HttpServletRequest request) {

		List<EmployeeInfoBean> empInfoBeans = dao.getAllEmployeeInfo();
		EmployeeResponse response = new EmployeeResponse();

		if (request.getSession(false) != null) {
			if (empInfoBeans != null) {

				response.setStatusCode(201);
				response.setMessage("Successfull");
				response.setDescription("Employee data found successfully");
				response.setEmpInfoBeans(empInfoBeans);
			} else {

				response.setStatusCode(301);
				response.setMessage("Failure");
				response.setDescription("Employee data not found");

			}
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Unauthorized access!!! Please login");
		}

		return response;
	}

	@DeleteMapping(path = "/deleteemployee", produces = MediaType.APPLICATION_JSON_VALUE)
	// @ResponseBody
	public EmployeeResponse deleteEmployee(@RequestParam("empId") String empId, HttpServletRequest request) {

		EmployeeResponse response = new EmployeeResponse();

		if (request.getSession(false) != null) {
			if (dao.deleteEmployeeInfo(empId)) {
				response.setStatusCode(201);
				response.setMessage("Delete Successfull");
				response.setDescription("Employee details deleted from the database");
			} else {
				response.setStatusCode(301);
				response.setMessage("Deletion failed");
				response.setDescription("Failed to delete Employee details");
			}
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Unauthorized access!!! Please login");
		}

		return response;
	}
}
