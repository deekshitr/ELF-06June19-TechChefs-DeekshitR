package com.techchefs.springboot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techchefs.springboot.beans.EmployeeAddressInfoBean;
import com.techchefs.springboot.beans.EmployeeEducationInfoBean;
import com.techchefs.springboot.beans.EmployeeExperienceInfoBean;
import com.techchefs.springboot.beans.EmployeeInfoBean;
import com.techchefs.springboot.beans.EmployeeOtherInfoBean;
import com.techchefs.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@GetMapping(path = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloWorld() {
		return "Hello World!!!";
	}

	@PostMapping(path = "/createemployee", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean infoBean) {

		infoBean.getOtherInfoBean().setInfoBean(infoBean);

		for (EmployeeEducationInfoBean employeeEducationInfoBean : infoBean.getEducationInfoBean()) {
			employeeEducationInfoBean.getEmpEducationInfoPKBean().setInfoBean(infoBean);
		}

		for (EmployeeAddressInfoBean addressInfoBean : infoBean.getAddressInfoBean()) {
			addressInfoBean.getEmpAddressPKBean().setInfoBean(infoBean);
		}

		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : infoBean.getExpirenceInfoBean()) {
			employeeExperienceInfoBean.getEmpExperienceInfoPKBean().setInfoBean(infoBean);
		}

		EmployeeInfoBean manager = infoBean.getManagerId();

		if (manager != null) {
			manager = repository.findById(manager.getId()).get();
			infoBean.setManagerId(manager);

		}

		EmployeeResponse response = new EmployeeResponse();

		if (!repository.existsById(infoBean.getId())) {
			repository.save(infoBean);
			response.setStatusCode(201);
			response.setMessage("Insertion Successfull");
			response.setDescription("Employee details added to the database");
		} else {
			response.setStatusCode(301);
			response.setMessage("Insertion failed");
			response.setDescription("Failed to add Employee details");
		}

		return response;
	}

	@PutMapping(path = "/updateemployee", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean infoBean) {

		// EmployeeInfoBean infoBean = new EmployeeInfoBean();

		infoBean.getOtherInfoBean().setInfoBean(infoBean);

		for (EmployeeEducationInfoBean employeeEducationInfoBean : infoBean.getEducationInfoBean()) {
			employeeEducationInfoBean.getEmpEducationInfoPKBean().setInfoBean(infoBean);
		}

		for (EmployeeAddressInfoBean addressInfoBean : infoBean.getAddressInfoBean()) {
			addressInfoBean.getEmpAddressPKBean().setInfoBean(infoBean);
		}

		for (EmployeeExperienceInfoBean employeeExperienceInfoBean : infoBean.getExpirenceInfoBean()) {
			employeeExperienceInfoBean.getEmpExperienceInfoPKBean().setInfoBean(infoBean);
		}

		EmployeeInfoBean manager = infoBean.getManagerId();

		if (manager != null) {
			manager = repository.findById(manager.getId()).get();
			infoBean.setManagerId(manager);
		}

		EmployeeResponse response = new EmployeeResponse();

		if (repository.existsById(infoBean.getId())) {
			infoBean.getOtherInfoBean().setOtherInfoId(repository.findByEmpId(infoBean).getOtherInfoId());
			repository.save(infoBean);
			response.setStatusCode(201);
			response.setMessage("Update Successfull");
			response.setDescription("Employee details updated in database");
		} else {
			response.setStatusCode(301);
			response.setMessage("Updation failed");
			response.setDescription("Failed to update Employee details");
		}

		return response;
	}

	@GetMapping(value = "/getotherinfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeOtherInfoBean getOtherInfo(int id) {
		EmployeeInfoBean infoBean = new EmployeeInfoBean();
		infoBean.setId(id);
		return repository.findByEmpId(infoBean);
	}

	@GetMapping(path = "/getemployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(@RequestParam int empSearch) {

		EmployeeResponse response = new EmployeeResponse();

		if (repository.existsById(empSearch)) {
			EmployeeInfoBean infoBean = repository.findById(empSearch).get();
			response.setStatusCode(201);
			response.setEmpInfoBeans(Arrays.asList(infoBean));
			response.setMessage("Successfull");
			response.setDescription("Employee details fetched from the database");
		} else {
			response.setStatusCode(301);
			response.setMessage("failed");
			response.setDescription("Failed to fetch Employee details");
		}
		return response;

	}

	
	 @GetMapping(path = "/getallsearchedemployee", produces = MediaType.APPLICATION_JSON_VALUE) 
	 public EmployeeResponse getAllSearchedEmployee(@RequestParam String empSearchValue) {
	  
	 List<EmployeeInfoBean> empInfoBeans = repository.findAllEmpById(empSearchValue);
	 
	 EmployeeResponse response = new EmployeeResponse();
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
	 
	 return response;
	  
	 }

	@GetMapping(path = "/getallemployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee() {
		List<EmployeeInfoBean> empInfoBeans = repository.findAllEmp();

		EmployeeResponse response = new EmployeeResponse();

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
		return response;

	}

	@DeleteMapping(path = "/deleteemployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(@RequestParam int empId) {

		EmployeeResponse response = new EmployeeResponse();

		EmployeeInfoBean infoBean = repository.findById(empId).get();

		if (infoBean != null) {
			repository.delete(infoBean);
			response.setStatusCode(201);
			response.setMessage("Delete Successfull");
			response.setDescription("Employee details deleted from the database");

		} else {
			response.setStatusCode(301);
			response.setMessage("Deletion failed");
			response.setDescription("Failed to delete Employee details");
		}

		return response;

	}

	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id, String password, HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();

		EmployeeInfoBean empInfo = repository.findById(id).get();

		if (empInfo != null && empInfo.getPassword().equals(password)) {

			request.getSession().setAttribute("empInfo", empInfo);
			response.setStatusCode(201);
			response.setMessage("Successfull");
			response.setDescription("Logged in Successfully");
			response.setEmpInfoBeans(Arrays.asList(empInfo));

		} else {
			response.setStatusCode(301);
			response.setMessage("Failure");
			response.setDescription("Invalid Credentials");
		}
		return response;
	}

	@GetMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse logout(HttpSession session) {
		session.invalidate();

		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("Successfull");
		response.setDescription("Logged out successfully");

		return response;
	}

}
