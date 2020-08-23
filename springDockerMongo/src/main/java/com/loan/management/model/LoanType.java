package com.loan.management.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter @NoArgsConstructor	
public class LoanType {
	
	@JsonProperty("loanTypeDesc")
	private String loanTypeDesc;
	@JsonProperty("percentage")
	private Double percentage;	

}
