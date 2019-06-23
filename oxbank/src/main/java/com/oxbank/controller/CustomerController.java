package com.oxbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oxbank.entity.Customer;
import com.oxbank.service.CustomerService;

@RestController
public class CustomerController {
@Autowired
	CustomerService customerService;

@PostMapping("/addingCustomer")
public String addingCustomerDetails(@RequestBody Customer customer) {
return "Adding Successful";
}
}