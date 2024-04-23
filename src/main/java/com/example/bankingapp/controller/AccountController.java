package com.example.bankingapp.controller;

import com.example.bankingapp.dto.AccountRequest;
import com.example.bankingapp.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/all")
    public List<AccountRequest> findAllAccounts() {
        return accountService
                .findAllAccounts();
    }

    @PostMapping("/create")
    public AccountRequest createNewAccount(@RequestBody AccountRequest dto) {
               return accountService
                       .createNewAccount(dto);

            }
}
