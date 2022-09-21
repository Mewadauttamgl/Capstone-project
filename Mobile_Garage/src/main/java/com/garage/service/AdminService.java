package com.garage.service;



import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestBody;

import com.garage.exception.IdNotFoundException;
import com.garage.model.Customer;
import com.garage.model.PhoneData;

import com.garage.model.Registration;

import com.garage.model.Repair;

import com.garage.model.Seller;
import com.garage.repository.CustomerRepository;
import com.garage.repository.MobileRepository;

import com.garage.repository.RegistrationRepository;

import com.garage.repository.RepairRepository;

import com.garage.repository.SellerRepository;

@Service

public class AdminService {

 @Autowired

 private RegistrationRepository regrepo;

 @Autowired

 private MobileRepository mobilerepo;

 @Autowired

 private RepairRepository repairrepo;

 @Autowired

 SellerRepository sellerrepo;
 
 @Autowired
  CustomerRepository customerrepo;

 public List<Registration> fetchData() {

 return regrepo.findAll();

 }

 public PhoneData insertMData(PhoneData phone)

 {

 return mobilerepo.save(phone);

 }

 public List<PhoneData> viewData()

 {

 return mobilerepo.findAll();

 }

 public String deleteData(String modelNo)

 {

 mobilerepo.deleteById(modelNo);

 return "Deleted";

 }

 public Optional<Registration> FindData(int cId) throws IdNotFoundException {

 Optional<Registration> reg=regrepo.findById(cId);

 if(reg.isPresent())

 {

  return reg;

 }

 else

 {

  throw new IdNotFoundException("Id Not Exist : "+cId);

 }

 }

 public String deleteCustomer(int cId) {

 regrepo.deleteById(cId);

 return "Customer Record Deleted ";

 }

 public Repair updateIssue(@RequestBody Repair repair)

 {

 return repairrepo.save(repair);

 }

 public List<Repair> viewIssue()

 {

 return repairrepo.findAll();

 }

 public Optional<Seller> getOldData(int cId) throws IdNotFoundException

 {
	 Optional<Seller> seller=sellerrepo.findById(cId);

	 if(seller.isPresent())

	 {

	  return seller;

	 }

	 else

	 {

	  throw new IdNotFoundException("Id Not Exist : "+cId);

	 }


 

 }

 public List<Seller> fetchOldData()

 {

 return sellerrepo.findAll();

 }

 public Seller addOldData(Seller seller)

 {

 return sellerrepo.save(seller);

 }
 public List<Customer> findAllOrders() {
		return customerrepo.findAll();
	}

}



