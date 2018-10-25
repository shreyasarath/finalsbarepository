package com.eg.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eg.customer.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
	
	

}
