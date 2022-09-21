package com.garage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneData {

	@Id
	@Column(name="Model_No")
	private String modelNo;
	
	@NotBlank(message = "please insert model number")
	@Column(name="Model_Name")
	private String mName;
	
	@NotBlank(message = "please insert Company name")
	@Column(name="Comp_Name")
	private String compName;
	
	@Column(name="Mobile_RAM")
	private int mRam;
	
	@Column(name="Hard_Disk")
	private int mHdisk;
	
	@Column(name="Mobile_Price")
	private double price;
}
