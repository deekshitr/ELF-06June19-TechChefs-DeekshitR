<%@page import="com.techchefs.empspringmvc.beans.EmployeeExperienceInfoBean"%>
<%@page import="com.techchefs.empspringmvc.beans.EmployeeEducationInfoBean"%>
<%@page import="com.techchefs.empspringmvc.beans.EmployeeAddressInfoBean"%>
<%@page import="java.util.List"%>
<%@page import="com.techchefs.empspringmvc.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	EmployeeInfoBean empInfo = (EmployeeInfoBean) session.getAttribute("empInfo");
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

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/style.css">
</head>

<body class="h-100 w-100">
	<div class="col-md-10 offset-1 mt-5 mb-5 signup-container">
		<form class="form-container" action="./updateemployee" method="post">

			<div>
				<div class="d-flex align-items-center">
					<i class="fa fa-plus fa-3x" data-toggle="collapse" href="#empInfo"
						role="button" aria-expanded="true" aria-controls="empInfo"></i>
					<h3 style="text-align: center; padding: 20px;" class="ml-auto">Employee
						Information</h3>
					<hr>
				</div>


				<div id="empInfo">
					<div class="form-row">
						<%-- <div class="form-group col-md-6">
							<label for="inputEmail4">ID</label> <input type="number"
								class="form-control" name="id" placeholder="Please Enter ID"
								value="<%=empInfo.getId()%>">
						</div> --%>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Account Number</label> <input
								type="number" class="form-control" name="accNum"
								placeholder="Please EnterAccount Number"
								value="<%=empInfo.getAccNum()%>">
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Password</label> <input type="password"
								class="form-control" name="password"
								placeholder="Please Enter Password"
								value="<%=empInfo.getPassword()%>">
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
								class="form-control" name="name" placeholder="Please Enter Name"
								value="<%=empInfo.getName()%>">
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Email Id</label> <input type="email"
								class="form-control" name="email"
								placeholder="Please Enter Email Id"
								value="<%=empInfo.getEmail()%>">
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Age</label><br> <input
								type="number" class="form-control" name="age"
								placeholder="Please Enter Age" value="<%=empInfo.getAge()%>">

						</div>

						<div class="form-group col-md-6">
							<label for="inputPassword4">Designation</label> <input
								type="text" class="form-control" name="designation"
								placeholder="Please Enter Designation"
								value="<%=empInfo.getDesignation()%>">
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Gender</label><br> <select
								class="w-100 h-50" name="gender">

								<%
									if (empInfo.getGender().equals("Male")) {
								%>

								<option value="Male" selected="selected">Male</option>
								<option value="Female">Female</option>
								<%
									} else if (empInfo.getGender().equals("Female")) {
								%>
								<option value="Male" selected="selected">Male</option>
								<option value="Female">Female</option>
								<%
									} else {
								%>
								<option value="" disabled="disabled" selected="selected">Please
									select</option>
								<option value="Male">Male</option>
								<option value="Female">Female</option>
								<%
									}
								%>

							</select>
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Date Of Birth</label> <input
								type="date" class="form-control" name="dob"
								placeholder="dd-mm-yyyy" value="<%=empInfo.getDob()%>">
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Salary</label> <input type="number"
								class="form-control" name="salary"
								placeholder="Please Enter Salary"
								value="<%=empInfo.getSalary()%>">
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Department ID</label> <input
								type="number" class="form-control"
								name="deptInfoBean.departmentId"
								placeholder="Please Enter Department ID "
								value="<%=empInfo.getDeptInfoBean().getDepartmentId()%>">
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Phone Number</label> <input
								type="number" class="form-control" name="phone"
								placeholder="Please Enter Phone Number"
								value="<%=empInfo.getPhone()%>">
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Manager ID</label> <input
								type="number" class="form-control" name="manager_Id"
								placeholder="Please Enter Manager ID"
								value="<%=empInfo.getManagerId()%>">

						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputPassword4">Date Of Joining</label> <input
								type="date" class="form-control" name="joiningDate"
								placeholder="dd-mm-yyyy" value="<%=empInfo.getJoiningDate()%>">
						</div>
					</div>

				</div>
			</div>

			<div>
				<div class="d-flex align-items-center">
					<i class="fa fa-plus fa-3x" data-toggle="collapse"
						href="#empOtherInfo" role="button" aria-expanded="true"
						aria-controls="empOtherInfo"></i>
					<h3 style="text-align: center; padding: 20px;" class="ml-auto">Employee
						Other Information</h3>
					<hr>
				</div>

				<div id="empOtherInfo">
					<div class="form-row">

						<div class="form-group col-md-4">
							<label for="inputPassword4">Emergency Contact Name</label> <input
								type="text" class="form-control"
								name="otherInfoBean.emergencyContactName"
								placeholder="Please Enter Emergency Contact Name"
								value="<%=empInfo.getOtherInfoBean().getEmergencyContactName()%>">
						</div>

						<div class="form-group col-md-4">
							<label for="inputPassword4">Father Name</label> <input
								type="text" name="otherInfoBean.fatherName" class="form-control"
								placeholder="Please Enter Father Name"
								value="<%=empInfo.getOtherInfoBean().getFatherName()%>">
						</div>

						<div class="form-group col-md-4">
							<label for="inputAddress">Mother Name</label> <input type="text"
								class="form-control" name="otherInfoBean.motherName"
								placeholder="Please Enter Mother Name"
								value="<%=empInfo.getOtherInfoBean().getMotherName()%>">
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-4">
							<label for="inputEmail4">Pan Number</label> <input type="text"
								name="otherInfoBean.pan" class="form-control"
								placeholder="Please Enter Pan Number"
								value="<%=empInfo.getOtherInfoBean().getPan()%>">
						</div>
						<div class="form-group col-md-4">
							<label for="inputPassword4">Emergency Contact Number</label> <input
								type="number" class="form-control"
								name="otherInfoBean.emergencyContactNumber"
								placeholder="Please Enter Emergency Contact Number"
								value="<%=empInfo.getOtherInfoBean().getEmergencyContactNumber()%>">
						</div>
						<div class="form-group col-md-4">
							<label for="inputAddress">Spouse Name</label> <input type="text"
								class="form-control" name="otherInfoBean.spouseName"
								placeholder="Please Enter Spouse Name"
								value="<%=empInfo.getOtherInfoBean().getSpouseName()%>">
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-4">
							<label for="inputEmail4">Maraital Status</label><br> <select
								name="otherInfoBean.isMarried"
								style="width: 408.75px; height: 37.99px;">

								<%
									if (empInfo.getOtherInfoBean().getIsMarried() == true) {
								%>
								<option value="true" selected="selected">Yes</option>
								<option value="false">No</option>

								<%
									} else if (empInfo.getOtherInfoBean().getIsMarried() == false) {
								%>
								<option value="true">Yes</option>
								<option value="false" selected="selected">No</option>
								<%
									} else {
								%>
								<option value="" disabled="disabled" selected="selected">Please
									select</option>
								<option value="true">Yes</option>
								<option value="false" selected="selected">No</option>
								<%
									}
								%>
							</select>

						</div>

						<div class="form-group col-md-4">

							<label for="inputPassword4">Nationality</label> <select
								name="otherInfoBean.nationality"
								style="width: 408.75px; height: 37.99px;">
								<%
									if (empInfo.getOtherInfoBean().getNationality().equals("Indian")) {
								%>
								<option value="Indian" selected="selected">Indian</option>
								<option value="Other">Other</option>
								<%
									} else if (empInfo.getOtherInfoBean().getNationality().equals("Other")) {
								%>
								<option value="Indian">Indian</option>
								<option value="Other" selected="selected">Other</option>
								<%
									} else {
								%>
								<option value="" disabled="disabled" selected="selected">Please
									select</option>
								<option value="Indian">Indian</option>
								<option value="Other" selected="selected">Other</option>
								<%
									}
								%>
							</select>
						</div>

						<div class="form-group col-md-4">
							<label for="inputAddress">Passport Number</label> <input
								type="number" class="form-control" name="otherInfoBean.passport"
								placeholder="please enter Passport Number"
								value="<%=empInfo.getOtherInfoBean().getPassport()%>">
						</div>

					</div>
					<div class="form-row">
						<div class="form-group col-md-4">
							<label for="inputEmail4">Blood Group</label> <select
								name="otherInfoBean.bloodGrp"
								style="width: 408.75px; height: 37.99px;">

								<%
									if (empInfo.getOtherInfoBean().getNationality().equals("A+")) {
								%>
								<option value="A+" selected="selected">A+</option>
								<option value="B+">B+</option>
								<option value="O+">O+</option>
								<option value="AB+">AB+</option>
								<option value="A-">A-</option>
								<option value="B-">B-</option>
								<option value="O-">O-</option>
								<option value="AB-">AB-</option>

								<%
									} else if (empInfo.getOtherInfoBean().getNationality().equals("B+")) {
								%>
								<option value="A+">A+</option>
								<option value="B+" selected="selected">B+</option>
								<option value="O+">O+</option>
								<option value="AB+">AB+</option>
								<option value="A-">A-</option>
								<option value="B-">B-</option>
								<option value="O-">O-</option>
								<option value="AB-">AB-</option>
								<%
									} else if (empInfo.getOtherInfoBean().getNationality().equals("O+")) {
								%>
								<option value="A+">A+</option>
								<option value="B+">B+</option>
								<option value="O+" selected="selected">O+</option>
								<option value="AB+">AB+</option>
								<option value="A-">A-</option>
								<option value="B-">B-</option>
								<option value="O-">O-</option>
								<option value="AB-">AB-</option>
								<%
									} else if (empInfo.getOtherInfoBean().getNationality().equals("AB+")) {
								%>
								<option value="A+">A+</option>
								<option value="B+">B+</option>
								<option value="O+">O+</option>
								<option value="AB+" selected="selected">AB+</option>
								<option value="A-">A-</option>
								<option value="B-">B-</option>
								<option value="O-">O-</option>
								<option value="AB-">AB-</option>
								<%
									} else if (empInfo.getOtherInfoBean().getNationality().equals("A-")) {
								%>
								<option value="A+">A+</option>
								<option value="B+">B+</option>
								<option value="O+">O+</option>
								<option value="AB+">AB+</option>
								<option value="A-" selected="selected">A-</option>
								<option value="B-">B-</option>
								<option value="O-">O-</option>
								<option value="AB-">AB-</option>
								<%
									} else if (empInfo.getOtherInfoBean().getNationality().equals("B-")) {
								%>
								<option value="A+">A+</option>
								<option value="B+">B+</option>
								<option value="O+">O+</option>
								<option value="AB+">AB+</option>
								<option value="A-">A-</option>
								<option value="B-" selected="selected">B-</option>
								<option value="O-">O-</option>
								<option value="AB-">AB-</option>
								<%
									} else if (empInfo.getOtherInfoBean().getNationality().equals("O-")) {
								%>
								<option value="A+">A+</option>
								<option value="B+">B+</option>
								<option value="O+">O+</option>
								<option value="AB+">AB+</option>
								<option value="A-">A-</option>
								<option value="B-">B-</option>
								<option value="O-" selected="selected">O-</option>
								<option value="AB-">AB-</option>
								<%
									} else if (empInfo.getOtherInfoBean().getNationality().equals("AB-")) {
								%>
								<option value="A+">A+</option>
								<option value="B+" selected="selected">B+</option>
								<option value="O+">O+</option>
								<option value="AB+">AB+</option>
								<option value="A-">A-</option>
								<option value="B-">B-</option>
								<option value="O-">O-</option>
								<option value="AB-" selected="selected">AB-</option>
								<%
									} else {
								%>
								<option value="" disabled="disabled" selected="selected">Please
									select</option>
								<option value="A+">A+</option>
								<option value="B+" selected="selected">B+</option>
								<option value="O+">O+</option>
								<option value="AB+">AB+</option>
								<option value="A-">A-</option>
								<option value="B-">B-</option>
								<option value="O-">O-</option>
								<option value="AB-" selected="selected">AB-</option>
								<%
									}
								%>
							</select>
						</div>
						<div class="form-group col-md-4">
							<label for="inputPassword4">Religion</label> <select
								style="width: 408.75px; height: 37.99px;"
								name="otherInfoBean.religion">

								<%
									if (empInfo.getOtherInfoBean().getNationality().equals("Hinduism")) {
								%>
								<option value="Hinduism" selected="selected">Hinduism</option>
								<option value="Islam">Islam</option>
								<option value="Sikhism">Sikhism</option>
								<option value="Buddhism">Buddhism</option>
								<option value="Jainism">Jainism</option>
								<option value="Other religions ">Other religions</option>
								<%
									} else if (empInfo.getOtherInfoBean().getNationality().equals("Islam")) {
								%>
								<option value="Hinduism">Hinduism</option>
								<option value="Islam" selected="selected">Islam</option>
								<option value="Sikhism">Sikhism</option>
								<option value="Buddhism">Buddhism</option>
								<option value="Jainism">Jainism</option>
								<option value="Other religions ">Other religions</option>
								<%
									} else if (empInfo.getOtherInfoBean().getNationality().equals("Sikhism")) {
								%>
								<option value="Hinduism">Hinduism</option>
								<option value="Islam">Islam</option>
								<option value="Sikhism" selected="selected">Sikhism</option>
								<option value="Buddhism">Buddhism</option>
								<option value="Jainism">Jainism</option>
								<option value="Other religions ">Other religions</option>
								<%
									} else if (empInfo.getOtherInfoBean().getNationality().equals("Buddhism")) {
								%>
								<option value="Hinduism">Hinduism</option>
								<option value="Islam">Islam</option>
								<option value="Sikhism">Sikhism</option>
								<option value="Buddhism" selected="selected">Buddhism</option>
								<option value="Jainism">Jainism</option>
								<option value="Other religions ">Other religions</option>
								<%
									} else if (empInfo.getOtherInfoBean().getNationality().equals("Jainism")) {
								%>
								<option value="Hinduism">Hinduism</option>
								<option value="Islam">Islam</option>
								<option value="Sikhism">Sikhism</option>
								<option value="Buddhism">Buddhism</option>
								<option value="Jainism" selected="selected">Jainism</option>
								<option value="Other religions">Other religions</option>
								<%
									} else if (empInfo.getOtherInfoBean().getNationality().equals("Other religions")) {
								%>
								<option value="Hinduism">Hinduism</option>
								<option value="Islam">Islam</option>
								<option value="Sikhism">Sikhism</option>
								<option value="Buddhism">Buddhism</option>
								<option value="Jainism">Jainism</option>
								<option value="Other religions" selected="selected">Other
									religions</option>
								<%
									} else {
								%>

								<option value="" disabled="disabled" selected="selected">Please
									select</option>
								<option value="Hinduism">Hinduism</option>
								<option value="Islam">Islam</option>
								<option value="Sikhism">Sikhism</option>
								<option value="Buddhism">Buddhism</option>
								<option value="Jainism">Jainism</option>
								<option value="Other religions">Other religions</option>
								<%
									}
								%>

							</select>
						</div>
						<div class="form-group col-md-4">
							<label for="inputAddress">Aadhar Number</label> <input
								type="number" class="form-control" name="otherInfoBean.adhar"
								placeholder="Please Enter  Aadhar Number"
								value="<%=empInfo.getOtherInfoBean().getAdhar()%>">
						</div>
					</div>


					<div class="form-row">
						<div class="form-group col-md-4">
							<label for="inputEmail4">Physically Challenged?</label> <select
								style="width: 408.75px; height: 37.99px;"
								name="otherInfoBean.isChallenged">
								<option value="" disabled="disabled" selected="selected">Please
									select</option>

								<%
									if (empInfo.getOtherInfoBean().getNationality().equals("true")) {
								%>
								<option value="true">YES</option>
								<option value="false">NO</option>
								<%
									} else if (empInfo.getOtherInfoBean().getNationality().equals("false")) {
								%>
								<option value="true">YES</option>
								<option value="false">NO</option>
								<%
									} else {
								%>
								<option value="" disabled="disabled" selected="selected">Please
									select</option>
								<option value="true">YES</option>
								<option value="false">NO</option>
								<%
									}
								%>
							</select>
						</div>

					</div>

				</div>
			</div>

			<%
				List<EmployeeAddressInfoBean> addressInfoBeans = empInfo.getAddressInfoBean();
				int i = 0;
				for (EmployeeAddressInfoBean addressInfoBean : addressInfoBeans) {
			%>

			<div>
				<div class="d-flex align-items-center">
					<i class="fa fa-plus fa-3x" data-toggle="collapse"
						href="#priEmpAddressInfo" role="button" aria-expanded="true"
						aria-controls="priEmpAddressInfo"></i>
					<h3 style="text-align: center; padding: 20px;" class="ml-auto">Primary
						Employee Address Information</h3>
					<hr>
				</div>

				<div id="priEmpAddressInfo">
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Address type</label> <select
								style="width: 640.75px; height: 39.99px;"
								name="addressInfoBean[<%=i%>].empAddressPKBean.addressType">

								<%
									if (addressInfoBean.getEmpAddressPKBean().getAddressType().equals("Permanent")) {
								%>

								<option value="Permanent" selected="selected">Permanent</option>
								<option value="Tempory">Tempory</option>

								<%
									} else if (addressInfoBean.getEmpAddressPKBean().getAddressType().equals("Tempory")) {
								%>
								<option value="Permanent">Permanent</option>
								<option value="Tempory" selected="selected">Tempory</option>
								<%
									} else {
								%>

								<option value="" disabled="disabled" selected="selected">Select-one</option>
								<option value="Permanent">Permanent</option>
								<option value="Tempory">Tempory</option>

								<%
									}
								%>
							</select>
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">State</label> <input type="text"
								class="form-control" placeholder=" Enter State"
								name="addressInfoBean[<%=i%>].state"
								value="<%=addressInfoBean.getState()%>">
						</div>

					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Address1</label><br> <input
								type="text" class="form-control" placeholder=" Enter Address1"
								name="addressInfoBean[<%=i%>].address1"
								value="<%=addressInfoBean.getAddress1()%>">

						</div>

						<div class="form-group col-md-6">

							<label for="inputPassword4">Country</label> <input type="text"
								class="form-control" placeholder="Enter Country"
								name="addressInfoBean[<%=i%>].country"
								value="<%=addressInfoBean.getCountry()%>">
						</div>



					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Address2</label><br> <input
								type="text" class="form-control" placeholder=" Enter Address2"
								name="addressInfoBean[<%=i%>].address2"
								value="<%=addressInfoBean.getAddress2()%>">
						</div>
						<div class="form-group col-md-6">
							<label for="Pincode">Pincode</label> <input type="number"
								class="form-control" placeholder="enter  Pincode"
								name="addressInfoBean[<%=i%>].pincode"
								value="<%=addressInfoBean.getPincode()%>">
						</div>


					</div>


					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Landmark</label> <input type="text"
								class="form-control" placeholder="Please Enter Landmark"
								name="addressInfoBean[<%=i%>].landmark"
								value="<%=addressInfoBean.getLandmark()%>">
						</div>

					</div>

				</div>
			</div>

			<%
				i++;
				}

				List<EmployeeEducationInfoBean> educationInfoBeans = empInfo.getEducationInfoBean();
				int j = 0;
				for (EmployeeEducationInfoBean educationInfoBean : educationInfoBeans) {
			%>

			<div>
				<div class="d-flex align-items-center">
					<i class="fa fa-plus fa-3x" data-toggle="collapse"
						href="#priEmpEducationInfo" role="button" aria-expanded="true"
						aria-controls="priEmpEducationInfo"></i>
					<h3 style="text-align: center; padding: 20px;" class="ml-auto">Primary
						Employee Educational Details</h3>
					<hr>
				</div>

				<div id="priEmpEducationInfo">

					<div class="form-row">

						<div class="form-group col-md-6">
							<label for="inputPassword4">Education Type</label> <input
								required type="text"
								name="educationInfoBean[<%=j%>].empEducationInfoPKBean.educationType"
								class="form-control" placeholder=" Education Type"
								value="<%=educationInfoBean.getEmpEducationInfoPKBean().getEducationType()%>">
						</div>
						<div class="form-group col-md-6">
							<label for="inputEmail4">Degree Type</label> <input required
								type="text" class="form-control"
								placeholder="Please Enter Degree Type"
								name="educationInfoBean[<%=j%>].degreeType"
								value="<%=educationInfoBean.getDegreeType()%>">
						</div>

					</div>
					<div class="form-row">

						<div class="form-group col-md-6">
							<label for="inputPassword4">Branch</label> <input type="text"
								name="educationInfoBean[<%=j%>].branch" class="form-control"
								placeholder="Please Enter Branch"
								value="<%=educationInfoBean.getDegreeType()%>">
						</div>
						<div class="form-group col-md-6">
							<label for="inputEmail4">Collage Name</label><br> <input
								type="text" name="educationInfoBean[<%=j%>].collegeName"
								class="form-control" placeholder="Please Enter Collage Name"
								value="<%=educationInfoBean.getCollegeName()%>">

						</div>

					</div>

					<div class="form-row">


						<div class="form-group col-md-6">

							<label for="inputPassword4">University</label> <input type="text"
								name="educationInfoBean[<%=j%>].university" class="form-control"
								placeholder="Please Enter University"
								value="<%=educationInfoBean.getUniversity()%>">
						</div>

						<div class="form-group col-md-6">
							<label for="inputPassword4">Year Of Passing</label> <input
								type="date" name="educationInfoBean[<%=j%>].yop"
								class="form-control" placeholder="dd-mm-yyyy"
								value="<%=educationInfoBean.getYop()%>">
						</div>

					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Percentage</label> <input type="number"
								name="educationInfoBean[<%=j%>].percentage" class="form-control"
								placeholder="Please Enter Percentage"
								value="<%=educationInfoBean.getPercentage()%>">
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Location </label> <input type="text"
								name="educationInfoBean[<%=j%>].location" class="form-control"
								placeholder="Please Enter Location"
								value="<%=educationInfoBean.getLocation()%>">

						</div>
					</div>
				</div>

			</div>

			<%
				j++;
				}

				List<EmployeeExperienceInfoBean> experienceInfoBeans = empInfo.getExpirenceInfoBean();
				int k = 0;
				for (EmployeeExperienceInfoBean experienceInfoBean : experienceInfoBeans) {
			%>

			<div>
				<div class="d-flex align-items-center">
					<i class="fa fa-plus fa-3x" data-toggle="collapse"
						href="#priEmpExperienceInfo" role="button" aria-expanded="true"
						aria-controls="priEmpExperienceInfo"></i>
					<h3 style="text-align: center; padding: 20px;" class="ml-auto">Primary
						Employee Experience Details</h3>
					<hr>
				</div>
				<div id="priEmpExperienceInfo">

					<div class="form-row">

						<div class="form-group col-md-6">
							<label for="inputPassword4">Company Name </label> <input required
								type="text"
								name="expirenceInfoBean[<%=k%>].empExperienceInfoPKBean.companyName"
								class="form-control" placeholder="please Enter Company Name"
								value="<%=experienceInfoBean.getEmpExperienceInfoPKBean().getCompanyName()%>">
						</div>
						<div class="form-group col-md-6">
							<label for="inputEmail4">Designation</label> <input required
								type="text" name="expirenceInfoBean[<%=k%>].designation"
								class="form-control" placeholder="Please Enter Designation" value="<%=experienceInfoBean.getDesignation()%>">
						</div>

					</div>
					<div class="form-row">


						<div class="form-group col-md-6">
							<label for="inputPassword4">Joining Date</label> <input
								type="date" name="expirenceInfoBean[<%=k%>].joiningDate"
								class="form-control" placeholder="dd-mm-yyyy" value="<%=experienceInfoBean.getJoiningDate()%>">
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">leaving Date</label> <input
								type="date" name="expirenceInfoBean[<%=k%>].leavingDate"
								class="form-control" placeholder="dd-mm-yyyy" value="<%=experienceInfoBean.getLeavingDate()%>">
						</div>
					</div>
				</div>
			</div>

			<%
				i++;
				}
			%>
		</form>

	</div>
	<script src="<%=request.getContextPath()%>/resources/js/signup.js"></script>
</body>

</html>