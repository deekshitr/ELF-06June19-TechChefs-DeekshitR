package com.techchefs.librarymanagementsystem.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Data;

@Data
@Entity
@Table(name="book_details")
public class BookDetailsBean implements Serializable {
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bookId")
	private List<IssueDetailsBean> bookDetails;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="isbn_no")
	private String isbnNo;
	
	@Column(name="title")
	private String bookTitle; 
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="category_id", referencedColumnName = "id")
	private CategoryBean category;
	
	@Column(name="author_name")
	private String authorName;
	
	@Column(name="count")
	private Integer count;
	
	@Column(name="price")
	private Double price;
	
}
