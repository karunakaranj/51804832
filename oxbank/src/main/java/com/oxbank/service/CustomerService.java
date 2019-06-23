package com.oxbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oxbank.entity.Customer;
import com.oxbank.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	public String customerAccount(Customer customer){
		
		if(customerRepository.save(customer)!=null) {
			
			return"customer added successfully";
			
		}
		else {
			return"customer does not added";
		}
	}
	
	

}
