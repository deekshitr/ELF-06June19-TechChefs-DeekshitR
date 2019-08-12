<%@page import="com.techchefs.empspringrest.beans.EmployeeInfoBean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	EmployeeInfoBean empInfo = (EmployeeInfoBean) session.getAttribute("empInfo");
%>
<!DOCTYPE html>
<html>

<head>
<meta charset='utf-8'>
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title>Page Title</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/home.css"/>

<script src='<%=request.getContextPath()%>/resources/js/home.js'></script>
</head>

<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top">
		<a class="navbar-brand" href="./home.html">EMP</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ml-5">
				<li class="nav-item active"><a class="nav-link"
					href="./home.html">Home </a></li>
				<!-- <li class="nav-item">
                      <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item dropdown">
                      <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Dropdown
                      </a>
                      <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Something else here</a>
                      </div>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link disabled" href="#">Disabled</a>
                    </li> -->
			</ul>
			<form class="form-inline my-2 my-lg-0 ml-auto mx-5"
				action="./searchemp" method="get">
				<div class="dropdown">
				<!-- <input hidden type="text" name = "url" value="searchemp"/> -->
					<input class="form-control search-box mr-sm-2" type="text"
						placeholder="Search with emp id or emp name" name="empSearch"
						aria-label="Search">
					<!-- <div class="dropdown-menu">
					<a class="dropdown-item" href="#">Another link</a> 
					<a class="dropdown-item" href="#">Another link</a>
					<a class="dropdown-item" href="#">Another link</a>
					<a class="dropdown-item" href="#">Another link</a>
					<a class="dropdown-item" href="#">Another link</a>
					<a class="dropdown-item" href="#">Another link</a>
					<a class="dropdown-item" href="#">Another link</a>
				</div> -->
				</div>

				<button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
			</form>

			<a class="navbar-brand" href="../logout"> Logout </a>   

		</div>
	</nav>

	<div class="d-flex mx-2 home-container">
		<div class="w-25 left-container">
			<div>
			
			<a href="./profile"><img src="<%=request.getContextPath()%>/resources/images/pic1.jpg"
					class="img-responsive img-thumbnail img-rounded" alt="">
			</a>
				
				<div class="m-5">
					<p>EMP ID : <%=empInfo.getId()%></p>
					<p>NAME : <%=empInfo.getName()%></p>
					<p>AGE : <%=empInfo.getAge()%></p>
					<p>GENDER : <%=empInfo.getGender()%></p>
				</div>

			</div>
		</div>
		<div class="right-container mb-2">
			<div class="card-group">
				<div class="card mx-2">
					<div class="d-flex m-3">
						<h2 class="card-title">Employee Info</h2>
						<a href="./update-emp-form" class="btn btn-primary w-25 login-up-btn ml-auto" >Edit</a>
					</div>
					<div class="card-body">
						<div>

							<div class="d-flex">
								<p class="card-text">EMP ID :</p>
								<div class="ml-2"><%=empInfo.getId()%></div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP First Name :</p>
								<div class="ml-2"><%=empInfo.getName()%></div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP AGE :</p>
								<div class="ml-2"><%=empInfo.getAge()%></div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP GENDER :</p>
								<div class="ml-2"><%=empInfo.getGender()%></div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP PHONE :</p>
								<div class="ml-2"><%=empInfo.getPhone()%></div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP JOINING DATE :</p>
								<div class="ml-2"><%=empInfo.getJoiningDate()%></div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP ACCOUNT NUM :</p>
								<div class="ml-2"><%=empInfo.getAccNum()%></div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP DESIGNATION :</p>
								<div class="ml-2"><%=empInfo.getDesignation()%></div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP DOB :</p>
								<div class="ml-2"><%=empInfo.getDob()%></div>
							</div>
						</div>
					</div>
				</div>
				<div class="card mx-2">
					<div class="d-flex m-3">
						<h2 class="card-title">Employee Other Info</h2>
						<button name="mybutton" type="button" id="loginbtn"
							class="btn btn-primary w-25 login-up-btn ml-auto">Edit</button>
					</div>
					<div class="card-body">
						<div>

							<div class="d-flex">
								<p class="card-text">EMP First Name :</p>
								<div class="ml-2">Dhanush</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP Last Name :</p>
								<div class="ml-2">Gowda</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP AGE :</p>
								<div class="ml-2">28</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP GENDER :</p>
								<div class="ml-2">MALE</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP PHONE :</p>
								<div class="ml-2">9944556677</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP JOINING DATE :</p>
								<div class="ml-2">23/09/1992</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP ACCOUNT NUM :</p>
								<div class="ml-2">6677889933</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP DESIGNATION :</p>
								<div class="ml-2">Software Engineer</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP DOB :</p>
								<div class="ml-2">23/09/1992</div>
							</div>
						</div>

					</div>
				</div>
			</div>
			<div class="card-group mt-4">
				<div class="card mx-2">
					<div class="d-flex m-3">
						<h2 class="card-title">Employee Address Info</h2>
						<button name="mybutton" type="button" id="loginbtn"
							class="btn btn-primary w-25 login-up-btn ml-auto">Edit</button>
					</div>
					<div class="card-body">
						<div>

							<div class="d-flex">
								<p class="card-text">EMP ID :</p>
								<div class="ml-2">1</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP First Name :</p>
								<div class="ml-2">Dhanush</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP Last Name :</p>
								<div class="ml-2">Gowda</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP AGE :</p>
								<div class="ml-2">28</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP GENDER :</p>
								<div class="ml-2">MALE</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP PHONE :</p>
								<div class="ml-2">9944556677</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP JOINING DATE :</p>
								<div class="ml-2">23/09/1992</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP ACCOUNT NUM :</p>
								<div class="ml-2">6677889933</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP DESIGNATION :</p>
								<div class="ml-2">Software Engineer</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP DOB :</p>
								<div class="ml-2">23/09/1992</div>
							</div>
						</div>

					</div>
				</div>
				<div class="card mx-2">
					<div class="d-flex m-3">
						<h2 class="card-title">Employee Educational Info</h2>
						<button name="mybutton" type="button" id="loginbtn"
							class="btn btn-primary w-25 login-up-btn ml-auto">Edit</button>
					</div>
					<div class="card-body">
						<div>

							<div class="d-flex">
								<p class="card-text">EMP ID :</p>
								<div class="ml-2">1</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP First Name :</p>
								<div class="ml-2">Dhanush</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP Last Name :</p>
								<div class="ml-2">Gowda</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP AGE :</p>
								<div class="ml-2">28</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP GENDER :</p>
								<div class="ml-2">MALE</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP PHONE :</p>
								<div class="ml-2">9944556677</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP JOINING DATE :</p>
								<div class="ml-2">23/09/1992</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP ACCOUNT NUM :</p>
								<div class="ml-2">6677889933</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP DESIGNATION :</p>
								<div class="ml-2">Software Engineer</div>
							</div>

							<div class="d-flex">
								<p class="card-text">EMP DOB :</p>
								<div class="ml-2">23/09/1992</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>

</body>

</html>