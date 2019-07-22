package com.techchefs.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.techchefs.emp.beans.EmployeeInfoBean;
import com.techchefs.emp.util.HibernateUtil;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String empIdValue = req.getParameter("id");
		String empPasswordValue = req.getParameter("password");
		
		Session session = HibernateUtil.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Criterion cr1 = Restrictions.eq("id", Integer.parseInt(empIdValue));
		Criterion cr2 = Restrictions.eq("password", empPasswordValue);
		criteria.add(cr1);
		criteria.add(cr2);
		
		EmployeeInfoBean empInfo = (EmployeeInfoBean) criteria.uniqueResult();
		
		if (empInfo != null) {
			
			HttpSession httpSession = req.getSession(true);
			
			httpSession.setAttribute("empInfo", empInfo);
			
			String url = "./home-page";
			resp.sendRedirect(url);
			
		} else {
			
			if ((empIdValue == null && empPasswordValue == null) || (empIdValue.isEmpty() && empPasswordValue.isEmpty())) {
				
				req.setAttribute("loginErrMsg", null);
			} else {
				req.setAttribute("loginErrMsg", "Invalid Emp ID or Password!!! Please try again");
			}
			
			String url = "./login-page";
			
			RequestDispatcher dispatcher = req.getRequestDispatcher(url);
			dispatcher.forward(req, resp);
					
		}
	}
}
