package com.techchefs.librarymanagementsystem.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="category")
public class CategoryBean implements Serializable {
	
	@Id
	@Column(name="id")
	private Integer categoryId;
	
	@Column(name="name")
	private String categoryName;
}
