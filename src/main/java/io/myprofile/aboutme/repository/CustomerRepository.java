package io.myprofile.aboutme.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.myprofile.aboutme.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
//	 List<Customer> findByName(String name); 

}
