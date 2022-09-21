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
import com.garage.model.Repair;
import com.garage.service.RepairService;

@RestController
public class RepairController {

	@Autowired 
	RepairService repairservice;
	
	@PostMapping("/RaiseIssue")
	public Repair raiseIssue(@Valid @RequestBody Repair repair) throws IdNotFoundException
	{
		return repairservice.addIssue(repair);

	}
	
	@GetMapping("/ViewIssueStatus/{issueId}")
	public Optional<Repair> viewIssueStatus(@PathVariable int issueId) throws IdNotFoundException
	{
		return repairservice.viewIssueStatus(issueId);
	}
}
