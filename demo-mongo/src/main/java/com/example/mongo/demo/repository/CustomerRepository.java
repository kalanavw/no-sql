package com.example.mongo.demo.repository;

import com.example.mongo.demo.collections.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Copyright (c) 2021 All Rights Reserved
 * Created by Kalana Weerarathne on 11/03/2021 6:58 AM.
 */
@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
}
