package com.techchefs.librarymanagementsystem.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="issue_details")
public class IssueDetailsBean implements Serializable {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserDetailsBean userId;
	
	@ManyToOne
	@JoinColumn(name="book_id")
	private BookDetailsBean bookId;
	
	@Column(name="issue_date")
	private Date issueDate;
	
	@Column(name="last_date")
	private Date lastDate;
	
	@Column(name="return_status")
	private String returnStatus;
	
}
