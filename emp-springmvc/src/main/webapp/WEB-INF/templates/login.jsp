<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	String loginErrMsg = (String) request.getAttribute("loginErrMsg");
%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Login Page</title>

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

<link rel="stylesheet" href="../css/style.css">

</head>

<body class="h-100 w-100">
	<div class="col-4 offset-4 mt-5 mb-5 login-container">
		<div class="form-container pt-5">

			<%
				if (loginErrMsg != null && !loginErrMsg.isEmpty()) {
			%>

			<div class="alert alert-danger alert-dismissible fade show"
				role="alert">
				<strong> <%=loginErrMsg%> </strong>
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>

			<%
				}
			%>

			<form rol="login" action="./login" method="post" noValidate>
				<legend class="text-center">Login</legend>
				<div class="form-group">
					<label for="email">Emp ID: </label> <input onkeyup="validateForm()"
						type="number" name="id" value="" class="form-control" required>
					<div class="email err-msg"></div>
				</div>

				<div class="form-group">
					<label for="password">Password : </label> <input id="password"
						onkeyup="validateForm()" type="password" value="" name="password"
						class="form-control" required> <i
						class="fa fa-eye eye-icon" onclick="onPassEyeClick()"></i>
					<div class="password err-msg"></div>
				</div>
				<div class="d-block">
					<button name="mybutton" type="submit"
						id="loginbtn" class="btn btn-primary login-up-btn float-right">Login</button>
				</div>

			</form>
		</div>

		<div class="d-block">
			<a class="btn btn-primary login-up-btn" href="./signup-form">Create
				Account</a> <a class="btn btn-primary login-up-btn float-right"
				href="./forgot-password">Forgot Password</a>
		</div>
	</div>

	<script src="./js/login.js"></script>
</body>

</html>