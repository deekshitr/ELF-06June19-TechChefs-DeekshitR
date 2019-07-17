import React, { Component } from 'react'

export default class EmployeeOtherInfo extends Component {
    render() {
        return (
            <div>
				<div class="d-flex align-items-center">
					<i class="fa fa-plus fa-3x" data-toggle="collapse"
						href="#empOtherInfo" role="button" aria-expanded="true"
						aria-controls="empOtherInfo"></i>
					<h3 class="ml-auto">Employee
						Other Information</h3>
					<hr />
				</div>

				<div id="empOtherInfo">
					<div class="form-row">

						<div class="form-group col-md-4">
							<label for="inputPassword4">Emergency Contact Name</label> 
                            <input
								type="text" class="form-control"
								name="otherInfoBean.emergencyContactName"
								placeholder="Please Enter Emergency Contact Name" />
						</div>

						<div class="form-group col-md-4">
							<label for="inputPassword4">Father Name</label> 
                            <input type="text" name="otherInfoBean.fatherName" class="form-control"
								placeholder="Please Enter Father Name" />
						</div>

						<div class="form-group col-md-4">
							<label for="inputAddress">Mother Name</label> 
                            <input type="text"
								class="form-control" name="otherInfoBean.motherName"
								placeholder="Please Enter Mother Name" />
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-4">
							<label for="inputEmail4">Pan Number</label> 
                            <input type="text"
								name="otherInfoBean.pan" class="form-control"
								placeholder="Please Enter Pan Number" />
						</div>
						<div class="form-group col-md-4">
							<label for="inputPassword4">Emergency Contact Number</label> 
                            <input
								type="number" class="form-control"
								name="otherInfoBean.emergencyContactNumber"
								placeholder="Please Enter Emergency Contact Number " />
						</div>
						<div class="form-group col-md-4">
							<label for="inputAddress">Spouse Name</label> 
                            <input type="text"
								class="form-control" name="otherInfoBean.spouseName"
								placeholder="Please Enter Spouse Name" />
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-4">
							<label for="inputEmail4">Maraital Status</label><br /> 
                            <select
								name="otherInfoBean.isMarried"
								>
								<option value="true">Yes</option>
								<option value="false">No</option>
							</select>

						</div>

						<div class="form-group col-md-4">

							<label for="inputPassword4">Nationality</label> <select
								name="otherInfoBean.nationality"
								>
								<option value="" disabled="disabled" selected="selected">Please
									select</option>
								<option value="Indian">Indian</option>
								<option value="Other">Other</option>
							</select>
						</div>

						<div class="form-group col-md-4">
							<label for="inputAddress">Passport Number</label> 
                            <input
								type="number" class="form-control" name="otherInfoBean.passport"
								placeholder="please enter Passport Number" />
						</div>

					</div>
					<div class="form-row">
						<div class="form-group col-md-4">
							<label for="inputEmail4">Blood Group</label> <select
								name="otherInfoBean.bloodGrp"
								 >
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
								
								name="otherInfoBean.religion">
								<option value="" disabled="disabled" selected="selected">Please
									select</option>
								<option value="Hinduism">Hinduism</option>
								<option value="Islam">Islam</option>
								<option value="Sikhism">Sikhism</option>
								<option value="Buddhism">Buddhism</option>
								<option value="Jainism">Jainism</option>
								<option value="Other religions ">Other religions</option>

							</select>
						</div>
						<div class="form-group col-md-4">
							<label for="inputAddress">Aadhar Number</label> 
                            <input
								type="number" class="form-control" name="otherInfoBean.adhar"
								placeholder="Please Enter  Aadhar Number" />
						</div>
					</div>


					<div class="form-row">
						<div class="form-group col-md-4">
							<label for="inputEmail4">Physically Challenged?</label> 
                            <select
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
        )
    }
}
