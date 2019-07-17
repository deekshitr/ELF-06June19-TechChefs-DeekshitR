import React, { Component } from 'react'

export default class EmployeeInfo extends Component {
    render() {
        return (
            <div>
				<div class="d-flex align-items-center">
					<i class="fa fa-plus fa-3x" data-toggle="collapse" href="#empInfo"
						role="button" aria-expanded="true" aria-controls="empInfo"></i>
					<h3 class="ml-auto">Employee
						Information</h3>
					<hr />
				</div>


				<div id="empInfo">
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">ID</label> 
                            <input type="number" class="form-control" name="id" placeholder="Please Enter ID" />
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Account Number</label> 
                            <input type="number" class="form-control" name="accNum"
								placeholder="Please EnterAccount Number" />
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Password</label>
                            <input type="password" class="form-control" name="password"
								placeholder="Please Enter Password" />
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Confirm Password</label> 
                            <input
								type="password" class="form-control"
								placeholder="Please Enter Confirm Password" />
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Name</label> 
                            <input type="text"
								class="form-control" name="name" placeholder="Please Enter Name" />
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Email Id</label>
                            <input type="email"
								class="form-control" name="email"
								placeholder="Please Enter Email Id" />
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Age</label><br />
                            <input type="number"
								class="form-control" name="age" placeholder="Please Enter Age" />

						</div>

						<div class="form-group col-md-6">
							<label for="inputPassword4">Designation</label>
                            <input
								type="text" class="form-control" name="designation"
								placeholder="Please Enter Designation" />
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Gender</label><br />
                            <select
								class="w-100 h-50" name="gender">
								<option value="" disabled="disabled" selected="selected">Please
									select</option>
								<option value="Male">Male</option>
								<option value="Female">Female</option>

							</select>
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Date Of Birth</label> 
                            <input type="date" class="form-control" name="dob"
								placeholder="dd-mm-yyyy" />
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Salary</label> 
                            <input type="number"
								class="form-control" name="salary"
								placeholder="Please Enter Salary" />
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Department ID</label> 
                            <input
								type="number" class="form-control" name="deptInfoBean.departmentId"
								placeholder="Please Enter Department ID" />
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Phone Number</label> 
                            <input type="number"
								class="form-control" name="phone"
								placeholder="Please Enter Phone Number" />
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Manager ID</label> 
                            <input type="number"
								class="form-control" name="manager_Id"
								placeholder="Please Enter Manager ID" />

						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputPassword4">Date Of Joining</label>
                            <input type="date" class="form-control" name="joiningDate"
								placeholder="dd-mm-yyyy" />
						</div>
					</div>

				</div>
			</div>
        )
    }
}
