package com.garage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.garage.exception.DataMisMatchException;
import com.garage.model.Customer;
import com.garage.model.OrderRequest;
import com.garage.model.PhoneData;
import com.garage.model.Registration;
import com.garage.repository.CustomerRepository;
import com.garage.repository.MobileRepository;
import com.garage.repository.RegistrationRepository;

@Service
public class BuyerService {

	@Autowired
	private RegistrationRepository adminrepo;

	@Autowired
	private MobileRepository mobilerepo;

	@Autowired
	private CustomerRepository customerrepo;

	public Registration dataMisMatch(Registration reg) throws DataMisMatchException {

		if (adminrepo.findBycEmail(reg.getCEmail()) == null) {
			return adminrepo.save(reg);
		} else {
			throw new DataMisMatchException("customer with this email id already exists " + reg.getCEmail());
		}
	}

	/*
	 * public Registration addData(Registration reg) { return adminrepo.save(reg); }
	 */

	public List<PhoneData> fetchData() {
		return mobilerepo.findAll();
	}

	public String placeOrder(OrderRequest request) {
		 customerrepo.save(request.getCustomer());
		 return "Order Placed";
	}

	/*public List<Customer> findAllOrders() {
		return customerrepo.findAll();
	}*/

}
