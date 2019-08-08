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

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/style.css">
</head>

<body class="h-100 w-100">
	<div class="col-md-10 offset-1 mt-5 mb-5 signup-container">
		<form class="form-container" action="./createemployee" method="post">


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
						<div class="form-group col-md-6">
							<label for="inputEmail4">ID</label> <input type="number"
								class="form-control" name="id" placeholder="Please Enter ID">
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Account Number</label> <input
								type="number" class="form-control" name="accNum"
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
								class="form-control" name="name" placeholder="Please Enter Name">
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Email Id</label> <input type="email"
								class="form-control" name="email"
								placeholder="Please Enter Email Id ">
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Age</label><br> <input type="number"
								class="form-control" name="age" placeholder="Please Enter Age">

						</div>

						<div class="form-group col-md-6">
							<label for="inputPassword4">Designation</label> <input
								type="text" class="form-control" name="designation"
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
							<label for="inputEmail4">Salary</label> <input type="number"
								class="form-control" name="salary"
								placeholder="Please Enter Salary">
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Department ID</label> <input
								type="number" class="form-control" name="deptInfoBean.departmentId"
								placeholder="Please Enter Department ID ">
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Phone Number</label> <input type="number"
								class="form-control" name="phone"
								placeholder="Please Enter Phone Number">
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Manager ID</label> <input type="number"
								class="form-control" name="managerId.id"
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
								placeholder="Please Enter Emergency Contact Name ">
						</div>

						<div class="form-group col-md-4">
							<label for="inputPassword4">Father Name</label> <input
								type="text" name="otherInfoBean.fatherName" class="form-control"
								placeholder="Please Enter Father Name">
						</div>

						<div class="form-group col-md-4">
							<label for="inputAddress">Mother Name</label> <input type="text"
								class="form-control" name="otherInfoBean.motherName"
								placeholder="Please Enter Mother Name">
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-4">
							<label for="inputEmail4">Pan Number</label> <input type="text"
								name="otherInfoBean.pan" class="form-control"
								placeholder="Please Enter Pan Number">
						</div>
						<div class="form-group col-md-4">
							<label for="inputPassword4">Emergency Contact Number</label> <input
								type="number" class="form-control"
								name="otherInfoBean.emergencyContactNumber"
								placeholder="Please Enter Emergency Contact Number ">
						</div>
						<div class="form-group col-md-4">
							<label for="inputAddress">Spouse Name</label> <input type="text"
								class="form-control" name="otherInfoBean.spouseName"
								placeholder="Please Enter Spouse Name">
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-4">
							<label for="inputEmail4">Maraital Status</label><br> <select
								name="otherInfoBean.isMarried"
								style="width: 408.75px; height: 37.99px;">
								<option value="true">Yes</option>
								<option value="false">No</option>
							</select>

						</div>

						<div class="form-group col-md-4">

							<label for="inputPassword4">Nationality</label> <select
								name="otherInfoBean.nationality"
								style="width: 408.75px; height: 37.99px;">
								<option value="" disabled="disabled" selected="selected">Please
									select</option>
								<option value="Indian">Indian</option>
								<option value="Other">Other</option>
							</select>
						</div>

						<div class="form-group col-md-4">
							<label for="inputAddress">Passport Number</label> <input
								type="number" class="form-control" name="otherInfoBean.passport"
								placeholder="please enter Passport Number">
						</div>

					</div>
					<div class="form-row">
						<div class="form-group col-md-4">
							<label for="inputEmail4">Blood Group</label> <select
								name="otherInfoBean.bloodGrp"
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
								style="width: 408.75px; height: 37.99px;"
								name="otherInfoBean.religion">
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
							<label for="inputAddress">Aadhar Number</label> <input
								type="number" class="form-control" name="otherInfoBean.adhar"
								placeholder="Please Enter  Aadhar Number">
						</div>
					</div>


					<div class="form-row">
						<div class="form-group col-md-4">
							<label for="inputEmail4">Physically Challenged?</label> <select
								style="width: 408.75px; height: 37.99px;"
								name="otherInfoBean.isChallenged">
								<option value="" disabled="disabled" selected="selected">Please
									select</option>
								<option value="true">YES</option>
								<option value="false">NO</option>
							</select>
						</div>

					</div>

				</div>
			</div>

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
							<label for="inputEmail4">Address type</label> 
							<select
								style="width: 640.75px; height: 39.99px;" name="addressInfoBean[0].empAddressPKBean.addressType">
								<option value="" disabled="disabled" selected="selected">Select-one</option>
								<option value="Permanent">Permanent</option>
								<option value="Female">Tempory</option>
							</select>
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">State</label>
							<input type="text"
								class="form-control" placeholder=" Enter State" name="addressInfoBean[0].state">
						</div>

					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Address1</label><br> <input
								type="text" class="form-control" placeholder=" Enter Address1" name="addressInfoBean[0].address1">

						</div>

						<div class="form-group col-md-6">

							<label for="inputPassword4">Country</label> <input type="text"
								class="form-control" placeholder="Enter Country" name="addressInfoBean[0].country">
						</div>



					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Address2</label><br> <input
								type="text" class="form-control" placeholder=" Enter Address2" name="addressInfoBean[0].address2">
						</div>
						<div class="form-group col-md-6">
							<label for="Pincode">Pincode</label> <input type="number"
								class="form-control" placeholder="enter  Pincode" name="addressInfoBean[0].pincode">
						</div>


					</div>


					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Landmark</label> <input type="text"
								class="form-control" placeholder="Please Enter Landmark" name="addressInfoBean[0].landmark">
						</div>

					</div>

				</div>
			</div>

			<div>
				<div class="d-flex align-items-center">
					<i class="fa fa-plus fa-3x" data-toggle="collapse"
						href="#secEmpAddressInfo" role="button" aria-expanded="true"
						aria-controls="secEmpAddressInfo"></i>
					<h3 style="text-align: center; padding: 20px;" class="ml-auto">Secondary
						Employee Address Information</h3>
					<hr>
				</div>

				<div id="secEmpAddressInfo">
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Address type</label> 
							<select
								style="width: 640.75px; height: 39.99px;" name="addressInfoBean[1].empAddressPKBean.addressType">
								<option value="" disabled="disabled" selected="selected">Select-one</option>
								<option value="Permanent">Permanent</option>
								<option value="Female">Tempory</option>
							</select>
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">State</label> <input type="text"
								class="form-control" placeholder=" Enter State" name="addressInfoBean[1].state">
						</div>

					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Address1</label><br> <input
								type="text" class="form-control" placeholder=" Enter Address1" name="addressInfoBean[1].address1">

						</div>

						<div class="form-group col-md-6">

							<label for="inputPassword4">Country</label> <input type="text"
								class="form-control" placeholder="Enter Country" name="addressInfoBean[1].country">
						</div>



					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Address2</label><br> <input
								type="text" class="form-control" placeholder=" Enter Address2" name="addressInfoBean[1].address2">
						</div>
						<div class="form-group col-md-6">
							<label for="Pincode">Pincode</label> <input type="number"
								class="form-control" placeholder="enter  Pincode" name="addressInfoBean[1].pincode">
						</div>


					</div>


					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Landmark</label> <input type="text"
								class="form-control" placeholder="Please Enter Landmark" name="addressInfoBean[1].landmark">
						</div>

					</div>

				</div>
			</div>

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
								required type="text" name="educationInfoBean[0].empEducationInfoPKBean.educationType" class="form-control"
								placeholder=" Education Type ">
						</div>
						<div class="form-group col-md-6">
							<label for="inputEmail4">Degree Type</label> <input required
								type="text" name="DegreeType" class="form-control"
								placeholder="Please Enter Degree Type" name="educationInfoBean[0].degreeType">
						</div>

					</div>
					<div class="form-row">

						<div class="form-group col-md-6">
							<label for="inputPassword4">Branch</label> <input type="text"
								name="educationInfoBean[0].branch" class="form-control"
								placeholder="Please Enter Branch ">
						</div>
						<div class="form-group col-md-6">
							<label for="inputEmail4">Collage Name</label><br> <input
								type="text" name="educationInfoBean[0].collegeName" class="form-control"
								placeholder="Please Enter Collage Name">

						</div>

					</div>

					<div class="form-row">


						<div class="form-group col-md-6">

							<label for="inputPassword4">University</label> <input type="text"
								name="educationInfoBean[0].university" class="form-control"
								placeholder="Please Enter University">
						</div>

						<div class="form-group col-md-6">
							<label for="inputPassword4">Year Of Passing</label> <input
								type="date" name="educationInfoBean[0].yop" class="form-control"
								placeholder="dd-mm-yyyy">
						</div>

					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Percentage</label> <input type="number"
								name="educationInfoBean[0].percentage" class="form-control"
								placeholder="Please Enter Percentage">
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Location </label> <input type="text"
								name="educationInfoBean[0].location" class="form-control"
								placeholder="Please Enter Location ">

						</div>
					</div>
				</div>

			</div>

			<div>
				<div class="d-flex align-items-center">
					<i class="fa fa-plus fa-3x" data-toggle="collapse"
						href="#secEmpEducationInfo" role="button" aria-expanded="true"
						aria-controls="secEmpEducationInfo"></i>
					<h3 style="text-align: center; padding: 20px;"
						class="ml-auto">Secondary Employee Educational
						Details</h3>
					<hr>
					</div>
					<div id="secEmpEducationInfo">

						<div class="form-row">

							<div class="form-group col-md-6">
								<label for="inputPassword4">Education Type</label> <input
									required type="text" name="educationInfoBean[1].empEducationInfoPKBean.educationType" class="form-control"
									placeholder=" Education Type ">
							</div>
							<div class="form-group col-md-6">
								<label for="inputEmail4">Degree Type</label> <input required
									type="text" name="educationInfoBean[1].degreeType" class="form-control"
									placeholder="Please Enter Degree Type">
							</div>

						</div>
						<div class="form-row">

							<div class="form-group col-md-6">
								<label for="inputPassword4">Branch</label> <input type="text"
									name="educationInfoBean[1].branch" class="form-control"
									placeholder="Please Enter Branch ">
							</div>
							<div class="form-group col-md-6">
								<label for="inputEmail4">Collage Name</label><br> <input
									type="text" name="educationInfoBean[1].collageName" class="form-control"
									placeholder="Please Enter Collage Name">

							</div>

						</div>

						<div class="form-row">


							<div class="form-group col-md-6">

								<label for="inputPassword4">University</label> <input
									type="text" name="educationInfoBean[1].university" class="form-control"
									placeholder="Please Enter University">
							</div>

							<div class="form-group col-md-6">
								<label for="inputPassword4">Year Of Passing</label> <input
									type="date" name="educationInfoBean[1].yob" class="form-control"
									placeholder="dd-mm-yyyy">
							</div>

						</div>

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">Percentage</label> <input type="number"
									name="educationInfoBean[1].percentage" class="form-control"
									placeholder="Please Enter Percentage">
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Location </label> <input type="text"
									name="educationInfoBean[1].location" class="form-control"
									placeholder="Please Enter Location ">

							</div>
						</div>
					</div>

				</div>

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
								<label for="inputPassword4">Company Name </label> <input
									required type="text" name="expirenceInfoBean[0].empExperienceInfoPKBean.companyName" class="form-control"
									placeholder="please Enter Company Name">
							</div>
							<div class="form-group col-md-6">
								<label for="inputEmail4">Designation</label> <input required
									type="text" name="expirenceInfoBean[0].designation" class="form-control"
									placeholder="Please Enter Designation">
							</div>

						</div>
						<div class="form-row">


							<div class="form-group col-md-6">
								<label for="inputPassword4">Joining Date</label> <input
									type="date" name="expirenceInfoBean[0].joiningDate" class="form-control"
									placeholder="dd-mm-yyyy">
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">leaving Date</label> <input
									type="date" name="expirenceInfoBean[0].leavingDate" class="form-control"
									placeholder="dd-mm-yyyy">
							</div>
						</div>
					</div>
				</div>

				<div>
					<div class="d-flex align-items-center">
					<i class="fa fa-plus fa-3x" data-toggle="collapse"
						href="#secEmpexperienceInfo" role="button" aria-expanded="true"
						aria-controls="secEmpexperienceInfo"></i>
					<h3 style="text-align: center; padding: 20px;" class="ml-auto">Secondary
						Employee Experience Details</h3>
					<hr>
					</div>
					<div id="secEmpexperienceInfo">

						<div class="form-row">

							<div class="form-group col-md-6">
								<label for="inputPassword4">Company Name </label> <input
									required type="text" name="expirenceInfoBean[1].empExperienceInfoPKBean.companyName" class="form-control"
									placeholder="please Enter Company Name">
							</div>
							<div class="form-group col-md-6">
								<label for="inputEmail4">Designation</label> <input required
									type="text" name="expirenceInfoBean[1].designation" class="form-control"
									placeholder="Please Enter Designation">
							</div>

						</div>
						<div class="form-row">


							<div class="form-group col-md-6">
								<label for="inputPassword4">Joining Date</label> <input
									type="date" name="expirenceInfoBean[1].joiningDate" class="form-control"
									placeholder="dd-mm-yyyy">
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">leaving Date</label> <input
									type="date" name="expirenceInfoBean[1].leavingDate" class="form-control"
									placeholder="dd-mm-yyyy">
							</div>


						</div>

					</div>
					
					
						<div class="btn-group w-100 m-5 mx-auto">
							<button type="reset" class="btn btn-secondary w-50">Reset</button>
							<button type="submit" class="btn btn-primary w-50">Submit</button>
						</div>
						
				</div>
		</form>

	</div>
	<script src="<%=request.getContextPath()%>/resources/js/signup.js"></script>
</body>

</html>