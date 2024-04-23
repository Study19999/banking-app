package com.example.bankingapp.repository;

import com.example.bankingapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Customer findByUsername(String username);
}
