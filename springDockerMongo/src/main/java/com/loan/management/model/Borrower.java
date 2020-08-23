package com.loan.management.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Borrower {	
	@JsonProperty("borrowerName")
	private String borrowerName;
	@JsonProperty("borrowerAddress")
	private String borrowerAddress;
	
}
