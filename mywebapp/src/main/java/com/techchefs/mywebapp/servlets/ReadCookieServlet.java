package com.techchefs.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookies")
public class ReadCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Get the cookies from request
		Cookie[] recievedCookies = req.getCookies();
		PrintWriter out = resp.getWriter();
		
		if (recievedCookies == null) {
			out.print("Cookies are not present");
		} else {
			out.print("Cookies are present");
			
			for (Cookie rcvdCookies: recievedCookies) {
				out.print("Cookie Name : "+rcvdCookies.getName());
				out.print("Cookie Name : "+rcvdCookies.getValue());
			}
		}
	}
}
