package com.techchefs.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student")
public class StudentBean implements Serializable {
	
	@Id
	@Column(name="roll_num")
	private int rollNum;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="subject")
	private String subject;
	@Column(name="total_marks")
	private double totalMarks;
	
}
