package com.example.bankingapp.dto;

public class AccountRequest {

    private Integer id;
    private Integer balance;
    private Integer customerId;


    public AccountRequest() {

    }

    public AccountRequest(Integer id, Integer balance, Integer customerId) {
        this.id = id;
        this.balance = balance;
        this.customerId = customerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
