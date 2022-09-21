package com.garage.controller;



import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.garage.exception.IdNotFoundException;
import com.garage.model.Customer;
import com.garage.model.PhoneData;

import com.garage.model.Registration;

import com.garage.model.Repair;

import com.garage.model.Seller;

import com.garage.service.AdminService;

@RestController

public class AdminController {

 @Autowired

 private AdminService adminservice;

 @GetMapping("/ViewRegisteredData")

 public List<Registration> getData() {

 return adminservice.fetchData();

 }

 @PostMapping("/InsertMobileData")

 public PhoneData insertData(@RequestBody PhoneData pdata)

 {

 return adminservice.insertMData(pdata);

 }

 @GetMapping("/ViewAllMobileData")

 public List<PhoneData> viewData() {

 return adminservice.viewData();

 }

 @DeleteMapping("/DeleteMobileData/{modelNo}")

 public String deleteData(@PathVariable String modelNo)

 {

 return adminservice.deleteData(modelNo);

 }

 @GetMapping("/FindById/{cId}")

 public Optional<Registration> findData(@PathVariable int cId) throws IdNotFoundException

 {

 return adminservice.FindData(cId);

 }

 @DeleteMapping("/DeleteCustomerData/{cId}")

 public String deleteCustomer(@PathVariable int cId)

 {

 return adminservice.deleteCustomer(cId);

 }

 @GetMapping("/ViewIssue")

 public List<Repair> viewIssue()

 {

 return adminservice.viewIssue();

 }

 @PutMapping("/UpdateIssue")

 public Repair updateIssue(@RequestBody Repair repair)

 {

 return adminservice.updateIssue(repair);

 }

 @GetMapping("/ViewOldMobileData")

 public List<Seller> viewOldData()

 {

 return adminservice.fetchOldData();

 }

 @GetMapping("/ViewOldMobileDataById/{cId}")

 public Optional<Seller> getOldData(@PathVariable int cId) throws IdNotFoundException

 {

 return adminservice.getOldData(cId);

 }

 @PutMapping("/EditOldPhoneStatus")

 public Seller addOldData(@RequestBody Seller seller)

 {

 return adminservice.addOldData(seller);

 }
 @GetMapping("/findAllOrders")
	public List<Customer> findAllOrders() {
		return adminservice.findAllOrders();
	}

}





