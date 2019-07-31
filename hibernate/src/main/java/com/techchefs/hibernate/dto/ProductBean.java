package com.techchefs.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="products")
public class ProductBean implements Serializable{
	
	@Id
	@Column(name="product_id")
	private int productId;
	@Column(name="product_name")
	private String productName;
	@Column(name="price")
	private double price;
	@Column(name="color")
	private String color;
	@Column(name="weight")
	private double weight;
	
}
