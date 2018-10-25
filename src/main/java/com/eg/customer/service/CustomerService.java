package com.eg.customer.service;

import java.util.List;

import com.eg.customer.model.Customer;



public interface CustomerService {
	
	List<Customer> getAllCustomers();
	void addCustomer(Customer customer);

}
