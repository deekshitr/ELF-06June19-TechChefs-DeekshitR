package com.techchefs.emp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Invalidate the session
		HttpSession httpSession = req.getSession(false);
		if (httpSession != null) {
			httpSession.invalidate();
			String url = "login.html";
			resp.sendRedirect(url);
		} else {
			String url = "login.html";
			resp.sendRedirect(url);
		}
		
	}
}
