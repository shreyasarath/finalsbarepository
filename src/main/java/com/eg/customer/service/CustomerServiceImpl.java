package com.eg.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.eg.customer.dao.CustomerDao;
import com.eg.customer.model.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	public CustomerDao customerDao;

	@Override
	public List<Customer> getAllCustomers() {
	   return customerDao.findAll();
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.save(customer);
	}

}
