<%@page import="com.techchefs.empspringmvc.dto.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<% 
	UserBean userBean = (UserBean) request.getAttribute("userBean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	User ID : <%=userBean.getUserId() %> <br>
	Password  : <%=userBean.getPassword() %>
</body>
</html>