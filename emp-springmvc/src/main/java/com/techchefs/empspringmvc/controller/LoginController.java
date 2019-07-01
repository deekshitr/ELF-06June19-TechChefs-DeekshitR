package com.techchefs.empspringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techchefs.empspringmvc.beans.EmployeeInfoBean;
import com.techchefs.empspringmvc.util.HibernateUtil;

@Controller
@RequestMapping("/employee-portal")
public class LoginController {

	@GetMapping("/login-form")
	public String getLoginForm() {
		return "login";
	}
	
	@PostMapping("/home-page")
	public String login(int id, String password, ModelMap modelMap, HttpServletRequest req) {

		Session session = HibernateUtil.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Criterion cr1 = Restrictions.eq("id", id);
		Criterion cr2 = Restrictions.eq("password", password);
		criteria.add(cr1);
		criteria.add(cr2);

		EmployeeInfoBean empInfo = (EmployeeInfoBean) criteria.uniqueResult();

		if (empInfo != null) {

			HttpSession httpSession = req.getSession(true);
			httpSession.setAttribute("empInfo", empInfo);
			
			modelMap.addAttribute("empIdValue", id);
			
			return "home";

		} else {
			
			modelMap.addAttribute("loginErrMsg", "Invalid Emp ID or Password!!! Please try again");
			return "login";
		}
	}
}
