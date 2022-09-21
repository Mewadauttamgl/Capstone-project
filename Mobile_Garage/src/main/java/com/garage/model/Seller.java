package com.garage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
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
@Table(name="Old_Phones")
public class Seller {

	  @Column(name="Customer_ID")
	  @Id
      private int cId;
	  
	  @Email
	  @NotBlank(message = "Email should not be blank")
	  @Column(name="Customer_Email")
      private String email;
	  
	  @Pattern(regexp = "(^[6-9][0-9]{9}$)", message = "mobile number should be in proper format")
	  @Size(min = 10, max = 10)
	  @Column(name="Phone_No")
      private String phoneNo;
	  
	  @NotBlank(message = "model number should not be blank")
	  @Column(name="Model_No")
      private String modelNo;
	  
	  @NotBlank(message = "Phone name should not be blank")
	  @Column(name="Phone_Name")
      private String phoneName;
	  
	  @NotBlank
	  @Column(name="Phone_Type")
      private String phoneType;
	  
	  @NotBlank(message = "provide some description")
	  @Column(name="Mobile_Desc")
      private String description;
	  
	  
	  @Column(name="Mobile_Price")
      private double price;
	  
	  @Column(name="Mobile_Status")
	  private String status;
}