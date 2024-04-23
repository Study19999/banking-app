package com.example.bankingapp.service;

import com.example.bankingapp.dto.AccountRequest;

import java.util.List;

public interface AccountService {
    List<AccountRequest> findAllAccounts ();
    AccountRequest createNewAccount(AccountRequest dto);

}
