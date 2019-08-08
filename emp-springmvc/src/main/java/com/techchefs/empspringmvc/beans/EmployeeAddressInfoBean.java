package com.techchefs.empspringmvc.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_address")
public class EmployeeAddressInfoBean implements Serializable {
	
	@EmbeddedId
	private EmployeeAddressInfoPKBean empAddressPKBean;
	
	@Column(name="address1")
	private String address1;
	@Column(name="address2")
	private String address2;
	@Column(name="landmark")
	private String landmark;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	@Column(name="pincode")
	private int pincode;
}
