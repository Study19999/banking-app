package com.example.bankingapp.controller;

import com.example.bankingapp.dto.CustomerRequest;
import com.example.bankingapp.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/all")
    public List<CustomerRequest> findAllCustomers() {
        return customerService
                .findAllCustomers();
    }
    @GetMapping("/getCustomerByUsername")
    public CustomerRequest findCustomerId(@RequestParam String username) {
        return customerService
                .findCustomerIdByUsername(username);
    }

    @PostMapping("/create")
    public CustomerRequest createNewCustomer(@RequestBody CustomerRequest dto) {
        return customerService
                .createNewCustomer(dto);
    }
}
