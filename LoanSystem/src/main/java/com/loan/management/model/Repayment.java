package com.loan.management.model;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Repayment {	
	
	@JsonProperty("paidAmount")
	private Double paidAmount;
	@JsonProperty("numberOfInstallments")
	private Double numberOfInstallments;
	@JsonProperty("lastInstallmentDate")
	private ZonedDateTime  lastInstallmentDate;
	@JsonProperty("nextDueDate")
	private ZonedDateTime  nextDueDate;
	@JsonProperty("remainingPrincipleAmount")
	private Double remainingPrincipleAmount;
	@JsonProperty("paidStatus")
	private String paidStatus;	
	
}
