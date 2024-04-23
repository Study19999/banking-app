package com.example.bankingapp.service.impl;

import com.example.bankingapp.dto.CustomerRequest;
import com.example.bankingapp.model.Customer;
import com.example.bankingapp.repository.CustomerRepository;
import com.example.bankingapp.service.CustomerService;
import com.example.bankingapp.utility.CustomerMapper;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper mapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper mapper) {
        this.customerRepository = customerRepository;
        this.mapper = mapper;
    }

    @Override
    public List<CustomerRequest> findAllCustomers() {
        return customerRepository
                .findAll()
                .stream()
                .map(mapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public CustomerRequest createNewCustomer(CustomerRequest request) {
        Customer customer = mapper.dtoToEntity(request);
        customerRepository.save(customer);

        return mapper.entityToDto(customer);
    }

    @Override
    public CustomerRequest findCustomerIdByUsername(String username) {
        Customer customer = customerRepository.findByUsername(username);

        return mapper.entityToDto(customer);
    }
}
