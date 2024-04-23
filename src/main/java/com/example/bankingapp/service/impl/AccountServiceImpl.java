package com.example.bankingapp.service.impl;

import com.example.bankingapp.dto.AccountRequest;
import com.example.bankingapp.model.Account;
import com.example.bankingapp.model.Customer;
import com.example.bankingapp.repository.AccountRepository;
import com.example.bankingapp.repository.CustomerRepository;
import com.example.bankingapp.service.AccountService;
import com.example.bankingapp.utility.AccountMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final CustomerRepository customerRepository;
    private final AccountMapper mapper;

    public AccountServiceImpl(AccountRepository accountRepository, CustomerRepository customerRepository, AccountMapper mapper) {
        this.accountRepository = accountRepository;
        this.customerRepository = customerRepository;
        this.mapper = mapper;
    }

    @Override
    public List<AccountRequest> findAllAccounts() {
        return accountRepository
                .findAll()
                .stream()
                .map(mapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public AccountRequest createNewAccount(AccountRequest dto) {
        Customer customer = customerRepository.getReferenceById(dto.getCustomerId());
        Account account = mapper.dtoToEntity(dto);
        dto.setCustomerId(dto.getCustomerId());
        account.setCustomer(customer);
        accountRepository.save(account);

        return mapper.entityToDto(account);
    }
}
