<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%! 
	public String name = "Rajani Kanth";
	private int age = 100;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getName(String name) {
		return "Given name is :- "+name;
	}
	
	{
		System.out.println("Hello");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP Tags Example ...</h1>
	<BR>
	 Name 1 : <%= name%> <BR>
	 Name 2 : <%= getName()%> <BR>
	 Name 3 : <%= getName("Deekshit") %> <BR><BR>
	 
	 Age 1 : <%= age %> <BR>
	 Age 2 : <%= getAge() %> <BR>
	 
	 <% 
		 for (int i=0;i<5;i++) {
	 
	 %>	
			 
			  Name 1 : <%= name%> <BR>
			  
	<% 
		 }
	 %>	
</body>
</html>