package com.techchefs.empspringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techchefs.empspringmvc.beans.EmployeeInfoBean;
import com.techchefs.empspringmvc.common.EMPConstants;
import com.techchefs.empspringmvc.util.HibernateUtil;

import lombok.extern.java.Log;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/employee-portal")
@PropertySource(EMPConstants.PROPERTY_CLASS_PATH)
@Log
public class LoginController {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@GetMapping("/login-form")
	public String getLoginForm() {
		return EMPConstants.VIEW_LOGIN_PAGE;
	}
	
	@GetMapping("/home-page")
	public String getHomePage() {
		return "home";
	}
	
	@GetMapping("/signup-form")
	public String getSignForm() {
		return EMPConstants.VIEW_SIGNUP_PAGE;
	}
	
	@GetMapping("/update-emp-form")
	public String getUpdateEmpForm() {
		return EMPConstants.VIEW_UPDATE_EMPINFO_PAGE;
	}
	
	@PostMapping("/login")
	public String login(int id, String password, ModelMap modelMap, HttpServletRequest req,
			@Value(value = "${loginErrMsg}") String loginErrMsg) {

		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Criterion cr1 = Restrictions.eq("id", id);
		Criterion cr2 = Restrictions.eq("password", password);
		criteria.add(cr1);
		criteria.add(cr2);

		EmployeeInfoBean empInfo = (EmployeeInfoBean) criteria.uniqueResult();

		if (empInfo != null) {

			HttpSession httpSession = req.getSession(true);
			httpSession.setAttribute("empInfo", empInfo);
			
			/* modelMap.addAttribute("empIdValue", id); */
			
			return "redirect:/employee-portal/validate/home-page";

		} else {
			
			modelMap.addAttribute("loginErrMsg", loginErrMsg);
			return "redirect:/employee-portal/login-form";
		}
	}
}
