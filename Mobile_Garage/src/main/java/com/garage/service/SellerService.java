package com.garage.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.garage.exception.IdNotFoundException;
import com.garage.model.Seller;
import com.garage.repository.RegistrationRepository;
import com.garage.repository.SellerRepository;

@Service

public class SellerService {

 @Autowired

  private SellerRepository sellerrepo;
 @Autowired
 private RegistrationRepository registrationrepo;
 public Seller addOldData(Seller seller) throws IdNotFoundException

 {
	 if(registrationrepo.existsById(seller.getCId()))
		 return sellerrepo.save(seller);

		else
			throw new IdNotFoundException("this is not registerd customer " +seller.getCId()+ " please register first");
 
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

}





