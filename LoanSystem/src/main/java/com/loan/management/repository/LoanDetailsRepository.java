package com.loan.management.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.loan.management.model.LoanDetails;

@Repository
public interface LoanDetailsRepository extends MongoRepository<LoanDetails, Double> {

}
