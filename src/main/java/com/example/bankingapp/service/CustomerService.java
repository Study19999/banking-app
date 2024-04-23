package com.example.bankingapp.service;

import com.example.bankingapp.dto.CustomerRequest;

import java.util.List;

public interface CustomerService {
    List<CustomerRequest> findAllCustomers();
    CustomerRequest createNewCustomer(CustomerRequest dto);

    CustomerRequest findCustomerIdByUsername(String username);
}
