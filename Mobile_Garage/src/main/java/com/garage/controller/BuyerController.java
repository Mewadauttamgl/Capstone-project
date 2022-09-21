package com.garage.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.garage.exception.DataMisMatchException;
import com.garage.model.Customer;
import com.garage.model.PhoneData;
import com.garage.model.Registration;
import com.garage.service.BuyerService;
import com.garage.model.OrderRequest;

@RestController
public class BuyerController {

	@Autowired
	private BuyerService buyerservice;

	@PostMapping("/Registration")
	public Registration insertData( @Valid @RequestBody  Registration reg) throws DataMisMatchException
	{  
		return buyerservice.dataMisMatch(reg);
	}

	@GetMapping("/ViewMobileData")
	public List<PhoneData> fetchData() {
		return buyerservice.fetchData();
	}

	@PostMapping("/placeOrder")
	public String placeOrder(@Valid @RequestBody OrderRequest request) {
		return buyerservice.placeOrder(request);
	}

	/*@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders() {
		return buyerservice.findAllOrders();
	}*/

}
