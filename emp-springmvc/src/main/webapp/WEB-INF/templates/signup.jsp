<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	String signupSuccessMsg = (String) request.getParameter("signupSuccessMsg");
    String signupErrMsg = (String) request.getParameter("signupErrMsg");
%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>
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
	
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css">
</head>

<body class="h-100 w-100">
	<div class="col-md-10 offset-1 mt-5 mb-5 signup-container">
		<form class="form-container" action="./createemployee" method="post">
			<h3 style="text-align: center; padding: 20px;">Employee
				Information</h3>
			<hr>

			<%
				if (signupSuccessMsg != null && !signupSuccessMsg.isEmpty()) {
			%>

			<div class="alert alert-success alert-dismissible fade show"
				role="alert">
				<strong> <%=signupSuccessMsg%>
				</strong>
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>

			<%
				}
			%>
			
			<%
				if (signupErrMsg != null && !signupErrMsg.isEmpty()) {
			%>

			<div class="alert alert-danger alert-dismissible fade show"
				role="alert">
				<strong> <%=signupErrMsg%>
				</strong>
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>

			<%
				}
			%>

			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">ID</label> <input type="text"
						class="form-control" name="id" placeholder="Please Enter ID">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Account Number</label> <input
						type="text" class="form-control" name="accNum"
						placeholder="Please EnterAccount Number ">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Password</label> <input type="password"
						class="form-control" name="password"
						placeholder="Please Enter Password">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Confirm Password</label> <input
						type="password" class="form-control"
						placeholder="Please Enter Confirm Password">
				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Name</label> <input type="text"
						class="form-control" name="name"
						placeholder="Please Enter Name">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Email Id</label> <input type="email"
						class="form-control" name="email"
						placeholder="Please Enter Email Id ">
				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Age</label><br> <input type="text"
						class="form-control" name="age" placeholder="Please Enter Age">

				</div>

				<div class="form-group col-md-6">
					<label for="inputPassword4">Designation</label> <input type="text"
						class="form-control" name="designation"
						placeholder="Please Enter Designation">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Gender</label><br> <select
						class="w-100 h-50" name="gender">
						<option value="" disabled="disabled" selected="selected">Please
							select</option>
						<option value="Male">Male</option>
						<option value="Female">Female</option>

					</select>
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Date Of Birth</label> <input
						type="date" class="form-control" name="dob"
						placeholder="dd-mm-yyyy">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Salary</label> <input type="text"
						class="form-control" name="salary"
						placeholder="Please Enter Salary">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Department ID</label> <input
						type="text" class="form-control" name="departmentId"
						placeholder="Please Enter Department ID ">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputEmail4">Phone Number</label> <input type="text"
						class="form-control" name="phone"
						placeholder="Please Enter Phone Number">
				</div>
				<div class="form-group col-md-6">
					<label for="inputPassword4">Manager ID</label> <input type="text"
						class="form-control" name="managerId"
						placeholder="Please Enter Manager ID">

				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="inputPassword4">Date Of Joining</label> <input
						type="date" class="form-control" name="joiningDate"
						placeholder="dd-mm-yyyy">
				</div>
			</div>


			<h3 style="text-align: center; padding: 20px;">Employee Other
				Information</h3>
			<hr>
			<div class="form-row">

				<div class="form-group col-md-4">
					<label for="inputPassword4">Emergency Contact Name</label> <input
						type="text" class="form-control" name="setOtherInfo.emergencyContactName"
						placeholder="Please Enter Emergency Contact Name ">
				</div>

				<div class="form-group col-md-4">
					<label for="inputPassword4">Father Name</label> <input type="text" name="setOtherInfo.fatherName"
						class="form-control" placeholder="Please Enter Father Name">
				</div>

				<div class="form-group col-md-4">
					<label for="inputAddress">Mother Name</label> <input type="text"
						class="form-control" name="setOtherInfo.motherName"
						placeholder="Please Enter Mother Name">
				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-md-4">
					<label for="inputEmail4">Pan Number</label> <input type="text" name="setOtherInfo.pan"
						class="form-control" placeholder="Please Enter Pan Number">
				</div>
				<div class="form-group col-md-4">
					<label for="inputPassword4">Emergency Contact Number</label> <input
						type="text" class="form-control" name="setOtherInfo.emergencyContactNumber"
						placeholder="Please Enter Emergency Contact Number ">
				</div>
				<div class="form-group col-md-4">
					<label for="inputAddress">Spouse Name</label> <input type="text"
						class="form-control" name="setOtherInfo.spouseName"
						placeholder="Please Enter Spouse Name">
				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-md-4">
					<label for="inputEmail4">Maraital Status</label><br> 
					<select name="setOtherInfo.isMarried"
						style="width: 408.75px; height: 37.99px;">
						<option value="true">Yes</option>
						<option value="false">No</option>
					</select>

				</div>

				<div class="form-group col-md-4">

					<label for="inputPassword4">Nationality</label> <select name="setOtherInfo.nationality"
						style="width: 408.75px; height: 37.99px;">
						<option value="" disabled="disabled" selected="selected">Please
							select</option>
						<option value="Indian">Indian</option>
						<option value="Other">Other</option>
					</select>
				</div>

				<div class="form-group col-md-4">
					<label for="inputAddress">Passport Number</label> <input
						type="text" class="form-control" name="setOtherInfo.passport" 
						placeholder="please enter Passport Number">
				</div>

			</div>
			<div class="form-row">
				<div class="form-group col-md-4">
					<label for="inputEmail4">Blood Group</label> <select name="setOtherInfo.bloodGrp"
						style="width: 408.75px; height: 37.99px;">
						<option value="" disabled="disabled" selected="selected">Please
							select</option>
						<option value="A+">A+</option>
						<option value="B+">B+</option>
						<option value="O+">O+</option>
						<option value="AB+">AB+</option>
						<option value="A-">A-</option>
						<option value="B-">B-</option>
						<option value="O-">O-</option>
						<option value="AB-">AB-</option>
					</select>
				</div>
				<div class="form-group col-md-4">
					<label for="inputPassword4">Religion</label> <select
						style="width: 408.75px; height: 37.99px;" name="setOtherInfo.religion">
						<option value="" disabled="disabled" selected="selected">Please
							select</option>
						<option value="Hinduism">Hinduism</option>
						<option value="Islam">Islam</option>
						<option value="Sikhism">Sikhism</option>
						<option value="Buddhism">Buddhism</option>
						<option value="Jainism">Jainism</option>
						<option value="Other religions ">Other religions</option>

						</option>

					</select>
				</div>
				<div class="form-group col-md-4">
					<label for="inputAddress">Aadhar Number</label> <input type="text"
						class="form-control" name="setOtherInfo.adhar"
						placeholder="Please Enter  Aadhar Number">
				</div>
			</div>


			<div class="form-row">
				<div class="form-group col-md-4">
					<label for="inputEmail4">Physically Challenged?</label> <select
						style="width: 408.75px; height: 37.99px;" name="setOtherInfo.isChallenged">
						<option value="" disabled="disabled" selected="selected">Please
							select</option>
						<option value="true">YES</option>
						<option value="false">NO</option>
					</select>
				</div>
				<div class="btn-group w-100 mx-auto">
					<button type="reset" class="btn btn-secondary w-50">Reset</button>
					<button type="submit" class="btn btn-primary w-50">Submit</button>
				</div>
			</div>

		</form>

	</div>
	<script src="<%=request.getContextPath()%>/resources/js/signup.js"></script>
</body>

</html>