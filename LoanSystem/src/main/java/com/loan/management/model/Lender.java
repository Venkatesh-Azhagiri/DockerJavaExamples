package com.loan.management.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter @NoArgsConstructor
public class Lender {	
	
	@JsonProperty("lenderName")
	private String lenderName;
	@JsonProperty("lenderAddress")
	private String lenderAddress;	
	
}
