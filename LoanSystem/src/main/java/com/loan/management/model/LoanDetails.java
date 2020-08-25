package com.loan.management.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Document(collection ="LoanDetails")
public class LoanDetails {
	@Id
	private ObjectId _id;
	@Indexed
	@JsonProperty("loanId")
	private Double loanId;	
	
	@JsonProperty("loanType")
	private LoanType loanType;
	
	@JsonProperty("loanAmount")
	private Double loanAmount;	  
	  
	@JsonProperty("lender")
	private Lender lender;
	  
	@JsonProperty("borrower")
	private Borrower borrower;
	  
	@JsonProperty("repayment")
	private Repayment repayment;
	 
}
