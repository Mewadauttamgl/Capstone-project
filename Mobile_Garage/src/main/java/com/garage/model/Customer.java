package com.garage.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
@Id
	@GeneratedValue
	
	@Column(name="orderId")
	private int orderId;
	
	@NotBlank(message = "Name should not be blank")
	@Column(name="name")
	private String name;
	
	@NotBlank(message = "address should not be blank")
	@Column(name="address")
	private String address;
	
	@Pattern(regexp = "(^[6-9][0-9]{9}$)", message = "mobile number should be in proper format")
	@Size(min = 10, max = 10)
	@Column(name="phoneNo")
	private String phoneNo; 
	
	@NotNull(message = "pin should not be null")
	@Size(min = 6, max = 6, message = "pin should be 6 digit")
	@Column(name="pincode")
	private String pincode;
	
	@OneToMany(targetEntity=Product.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Order_Id", referencedColumnName="orderId")
	private List<Product> products;
}
