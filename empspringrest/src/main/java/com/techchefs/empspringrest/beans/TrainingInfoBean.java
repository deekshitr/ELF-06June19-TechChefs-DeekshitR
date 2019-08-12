package com.techchefs.empspringrest.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

//@Data
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="training_info")
public class TrainingInfoBean implements Serializable {
	
	@Id
	@Column(name="course_id")
	private Integer courseId;
	
	@Column(name="course_name")
	private String courseName;
	
	@Column(name="duration")
	private Integer duration;
	
	@Column(name="course_type")
	private String courseType;
	
	
	
	public Integer getCourseId() {
		return courseId;
	}



	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}



	public String getCourseName() {
		return courseName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public Integer getDuration() {
		return duration;
	}



	public void setDuration(Integer duration) {
		this.duration = duration;
	}



	public String getCourseType() {
		return courseType;
	}



	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}



	public List<EmployeeInfoBean> getInfoBean() {
		return infoBean;
	}



	public void setInfoBean(List<EmployeeInfoBean> infoBean) {
		this.infoBean = infoBean;
	}



	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_training_info",
			joinColumns = {@JoinColumn(name="course_id")},
			inverseJoinColumns = {@JoinColumn(name="id")})
	
	List<EmployeeInfoBean> infoBean;
}
