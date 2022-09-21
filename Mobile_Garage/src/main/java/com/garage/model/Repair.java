package com.garage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Repair {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="Issue_ID")
	private int issueId;
	
	
	@Column(name="CR_ID")
	private int customerId;
	
	@NotBlank(message = "Please insert name")
	@Column(name="CR_Name")
	private String customerName;
	
	@NotBlank(message = "Please insert address")
	@Column(name="CR_Address")
	private String CustomerAddress;
	
	@NotBlank
	@Size(max=6,min=6)
	@Column(name="CR_PinCode")
	private String pinCode;
	
	@Pattern(regexp = "(^[6-9][0-9]{9}$)", message = "mobile number should be in proper format")
	@Size(min = 10, max = 10)
	@Column(name="CR_Mobile")
	private String customerMobile;
	
	@NotBlank
	@Column(name="CR_MobileName")
	private String mobileName;
	
	@NotBlank
	@Column(name="Issue_Description")
	private String issueDescription;
	
	@Column(name="Issue_Status")
	private String Status;
}
