import React, { Component } from 'react'

export default class EmployeeAddressInfo extends Component {
    render() {
        return (
            <div>
                
                <div>
				<div class="d-flex align-items-center">
					<i class="fa fa-plus fa-3x" data-toggle="collapse"
						href="#priEmpAddressInfo" role="button" aria-expanded="true"
						aria-controls="priEmpAddressInfo"></i>
					<h3 class="ml-auto">Primary
						Employee Address Information</h3>
					<hr />
				</div>

				<div id="priEmpAddressInfo">
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Address type</label> 
							<select name="addressInfoBean[0].empAddressPKBean.addressType">
								<option value="" disabled="disabled" selected="selected">Select-one</option>
								<option value="Permanent">Permanent</option>
								<option value="Female">Tempory</option>
							</select>
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">State</label>
							<input type="text"
								class="form-control" placeholder=" Enter State" name="addressInfoBean[0].state" />
						</div>

					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Address1</label><br /> 
                            <input type="text" class="form-control" placeholder=" Enter Address1" name="addressInfoBean[0].address1" />

						</div>

						<div class="form-group col-md-6">

							<label for="inputPassword4">Country</label> 
                            <input type="text"
								class="form-control" placeholder="Enter Country" name="addressInfoBean[0].country" />
						</div>



					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Address2</label><br /> 
                            <input type="text" class="form-control" placeholder=" Enter Address2" name="addressInfoBean[0].address2" />
						</div>
						<div class="form-group col-md-6">
							<label for="Pincode">Pincode</label> 
                            <input type="number"
								class="form-control" placeholder="enter  Pincode" name="addressInfoBean[0].pincode" />
						</div>


					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Landmark</label> <input type="text"
								class="form-control" placeholder="Please Enter Landmark" name="addressInfoBean[0].landmark" />
						</div>

					</div>

				</div>
			</div>

            <div>
				<div class="d-flex align-items-center">
					<i class="fa fa-plus fa-3x" data-toggle="collapse"
						href="#secEmpAddressInfo" role="button" aria-expanded="true"
						aria-controls="secEmpAddressInfo"></i>
					<h3 class="ml-auto">Secondary
						Employee Address Information</h3>
					<hr />
				</div>

				<div id="secEmpAddressInfo">
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Address type</label> 
							<select
								name="addressInfoBean[1].empAddressPKBean.addressType">
								<option value="" disabled="disabled" selected="selected">Select-one</option>
								<option value="Permanent">Permanent</option>
								<option value="Female">Tempory</option>
							</select>
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">State</label> 
                            <input type="text"
								class="form-control" placeholder=" Enter State" name="addressInfoBean[1].state" />
						</div>

					</div>

					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Address1</label><br /> <input
								type="text" class="form-control" placeholder=" Enter Address1" name="addressInfoBean[1].address1" />

						</div>

						<div class="form-group col-md-6">

							<label for="inputPassword4">Country</label> 
                            <input type="text"
								class="form-control" placeholder="Enter Country" name="addressInfoBean[1].country" />
						</div>



					</div>
					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Address2</label><br /> 
                            <input
								type="text" class="form-control" placeholder=" Enter Address2" name="addressInfoBean[1].address2" />
						</div>
						<div class="form-group col-md-6">
							<label for="Pincode">Pincode</label> 
                            <input type="number"
								class="form-control" placeholder="enter  Pincode" name="addressInfoBean[1].pincode" />
						</div>


					</div>


					<div class="form-row">
						<div class="form-group col-md-6">
							<label for="inputEmail4">Landmark</label> 
                            <input type="text"
								class="form-control" placeholder="Please Enter Landmark" name="addressInfoBean[1].landmark" />
						</div>

					</div>

				</div>
			</div>
            
            </div>
        )
    }
}

