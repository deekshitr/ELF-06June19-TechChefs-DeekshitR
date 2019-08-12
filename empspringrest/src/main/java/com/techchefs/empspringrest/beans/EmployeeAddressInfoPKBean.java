package com.techchefs.empspringrest.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;

//@Data
@XmlAccessorType(XmlAccessType.FIELD)
@Embeddable
public class EmployeeAddressInfoPKBean implements Serializable {
	
	@XmlTransient
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfoBean infoBean;
	
	@Column(name="address_type")
	private String addressType;

	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}

	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	
}
