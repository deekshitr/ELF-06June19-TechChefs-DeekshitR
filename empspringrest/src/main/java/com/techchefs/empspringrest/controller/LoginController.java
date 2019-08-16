package com.techchefs.empspringrest.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techchefs.empspringrest.beans.EmployeeInfoBean;
import com.techchefs.empspringrest.common.EMPConstants;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/employee-portal")
@PropertySource(EMPConstants.PROPERTY_CLASS_PATH)
public class LoginController {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@PostMapping(value = "/login",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id, String password,
			HttpServletRequest request) {
		
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Criterion cr1 = Restrictions.eq("id", id);
		Criterion cr2 = Restrictions.eq("password", password);
		criteria.add(cr1);
		criteria.add(cr2);

		EmployeeInfoBean empInfo = (EmployeeInfoBean) criteria.uniqueResult();
		
		EmployeeResponse response = new EmployeeResponse();
		
		if (empInfo != null) {

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
	
	@GetMapping(value="/logout",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse logout(HttpSession session) {
		session.invalidate();
		
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("Successfull");
		response.setDescription("Logged out successfully");
		
		return response;
	}
	
	@GetMapping(value="/readcookie",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse readCookie(@CookieValue(name="JSESSIONID") String sessionId) {
		
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("Successfull");
		response.setDescription("JSESSIONID : "+sessionId);
		
		return response;
		
	}
	
	public EmployeeResponse validater(HttpServletRequest request) {
		if (request.getSession(false) != null) {
			
		} else {
			
		}
		return null;
	}
}
