package com.garage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {

	@Id
	@GeneratedValue
	@Column(name="productId")
	private int productId;
	
	@NotBlank(message ="model number should not be blank")
	@Column(name="modelNo")
	private String modelNo;
	
	@NotBlank(message = "product name should not be blank")
	@Column(name="productName")
	private String productName;
	
	//@NotBlank(message = "please provide the number of quantity you wants to order")
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
	private int price;
}