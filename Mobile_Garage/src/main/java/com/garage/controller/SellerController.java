package com.garage.controller;



import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.garage.exception.IdNotFoundException;
import com.garage.model.Seller;

import com.garage.service.SellerService;

@RestController

public class SellerController {

 @Autowired

 SellerService sellerservice;

 @GetMapping("/CheckStatus/{cId}")

 public Optional<Seller> getOldData(@PathVariable int cId) throws IdNotFoundException

 {

 return sellerservice.getOldData(cId);

 }

 @PostMapping("/AddOldPhoneData")

 public Seller addOldData( @Valid @RequestBody  Seller seller) throws IdNotFoundException

 {

 return sellerservice.addOldData(seller);

 }

}



