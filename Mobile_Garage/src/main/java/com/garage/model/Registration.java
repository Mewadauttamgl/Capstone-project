package com.garage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "Customer_Id")
	private int cId;

	@NotBlank(message = "name should not be blank")
	@Column(name = "Customer_Name")
	private String cName;

	@Pattern(regexp = "(^[6-9][0-9]{9}$)", message = "mobile number should be in proper format")
	@Size(min = 10, max = 10)
	@Column(name = "C_Phone_No")
	private String Pno;

	@NotBlank(message = "plz insert value")
	@Column(name = "C_Address")
	private String cAdd;

	@Email(message = "email should be in proper format")
	@Column(name = "C_Email")
	private String cEmail;

	// @Pattern(regexp = "[1-9]{6}")
	@NotNull(message = "pin should not be null")
	@Column(name = "Pin_Code")
	@Size(min = 6, max = 6, message = "pin should be 6 digit")
	private String cPcode;

}