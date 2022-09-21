package com.garage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garage.exception.IdNotFoundException;
import com.garage.model.Repair;
import com.garage.model.Seller;
import com.garage.repository.RegistrationRepository;
import com.garage.repository.RepairRepository;

@Service
public class RepairService {

	@Autowired
	private RepairRepository repairrepo;
	@Autowired
	private RegistrationRepository registrationrepo;
	
	public Repair addIssue(Repair repair) throws IdNotFoundException
	
	{	
	if(registrationrepo.existsById(repair.getCustomerId()))
		return repairrepo.save(repair);
	else
		throw new IdNotFoundException("this is not registerd customer " +repair.getCustomerId()+ " please register first");
		
		
	}
	
	public Optional<Repair> viewIssueStatus( int issueId) throws IdNotFoundException
	{
		 Optional<Repair> repair=repairrepo.findById(issueId);
		 if(repair.isPresent())

		 {

		  return repair;

		 }

		 else

		 {

		  throw new IdNotFoundException("Id Not Exist : "+issueId);

		 }


		
		
	}
	/*public boolean validCustomer(int id) {
		
		if(registrationrepo.findById(id)==null)
		 return true;
		else
			return false;
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

	}*/
}
