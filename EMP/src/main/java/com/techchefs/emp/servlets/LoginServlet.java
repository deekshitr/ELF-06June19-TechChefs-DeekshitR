package com.techchefs.emp.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.techchefs.emp.beans.EmployeeInfoBean;
import com.techchefs.emp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			int empId = Integer.parseInt(req.getParameter("id"));
			String password = req.getParameter("password");
			
			log.info("empId"+ empId);
			log.info("password"+ password);
			
			Session session = HibernateUtil.openSession();
			Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
			Criterion cr1 = Restrictions.eq("id", empId);
			Criterion cr2 = Restrictions.eq("password", password);
			criteria.add(cr1);
			criteria.add(cr2);
			EmployeeInfoBean empInfo = (EmployeeInfoBean) criteria.uniqueResult();
				
			if(empInfo != null) {
				log.info("Name ------> " +empInfo.getName());
				log.info("Id ------> " +empInfo.getId());
				log.info("Age ------> " +empInfo.getAge());
				log.info("Gender ------> " +empInfo.getGender());
				log.info("Salary ------> " +empInfo.getSalary());
				log.info("Phone ------> " +empInfo.getPhone());
				HttpSession httpsession = req.getSession(true);
				
				String url = "home.html";
				resp.sendRedirect(url);
			} else {
				log.info("Error login");
				
			}
				
			
		}
}
