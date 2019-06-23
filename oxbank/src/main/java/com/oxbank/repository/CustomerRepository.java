package com.oxbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oxbank.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long>{

	

}
	
