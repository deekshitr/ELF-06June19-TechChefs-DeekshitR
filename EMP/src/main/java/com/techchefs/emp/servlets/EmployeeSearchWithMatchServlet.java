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
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.techchefs.emp.beans.EmployeeInfoBean;
import com.techchefs.emp.dao.EmployeeDAO;
import com.techchefs.emp.dao.EmployeeDAOFactory;
import com.techchefs.emp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
@WebServlet("/searchempmatch")
public class EmployeeSearchWithMatchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession httpSession = req.getSession(false);

		if (httpSession == null) {
			String url = "login.html";
			resp.sendRedirect(url);
		} else {
			String empSearchValue = req.getParameter("empSearch");

//			SessionFactory factory = HibernateUtil.getSessionFactory();
//			Session session = factory.openSession();
//			Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
//			Criterion cr1 = Restrictions.like("id", empSearchValue, MatchMode.START);
//			criteria.add(cr1);

//			List<EmployeeInfoBean> empInfo = criteria.list();

//			String empSearchNameValue = req.getParameter("empSearch");
//			Criterion cr2 = Restrictions.like("id",empSearchNameValue);
//			criteria.add(cr1);
//			criteria.add(cr2);

			log.info("idValue" + empSearchValue);
			EmployeeDAO dao = EmployeeDAOFactory.getInstance();
			EmployeeInfoBean empBean = new EmployeeInfoBean();
			empBean.setId(Integer.parseInt(empSearchValue));
			List<EmployeeInfoBean> empInfo = dao.getMatchedEmployeeInfo(empSearchValue);

			for (EmployeeInfoBean employeeInfoBean : empInfo) {
				log.info("Name ------> " + employeeInfoBean.getName());
				log.info("Id ------> " + employeeInfoBean.getId());
				log.info("Age ------> " + employeeInfoBean.getAge());
				log.info("Gender ------> " + employeeInfoBean.getGender());
				log.info("Salary ------> " + employeeInfoBean.getSalary());
				log.info("Phone ------> " + employeeInfoBean.getPhone());
			}
		}

	}
}
