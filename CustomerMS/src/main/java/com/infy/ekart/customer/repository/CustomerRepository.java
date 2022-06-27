package com.infy.ekart.customer.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.infy.ekart.customer.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String> {

	List<Customer> findByPhoneNumber(String phoneNumber);

	Optional<Customer> findByPassword(String currentPassword);

	

}
