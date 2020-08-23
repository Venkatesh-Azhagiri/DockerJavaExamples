package com.loan.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.management.model.LoanDetails;
import com.loan.management.repository.LoanDetailsRepository;

@CrossOrigin(origins="*")
@RestController
public class LoanManagementController {	
	
	@Autowired
	LoanDetailsRepository loanDetailsRepository;
	
	
	@GetMapping(value = "/loanDetails")
	public List<LoanDetails> getLoanDetails() {
		return loanDetailsRepository.findAll();
	}
}
