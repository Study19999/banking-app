package com.example.bankingapp.dto;

import java.util.ArrayList;
import java.util.List;


public class CustomerRequest {
    private Integer id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private List<AccountRequest> accounts = new ArrayList<>();

    public CustomerRequest(){

    }
    public CustomerRequest(Integer id, String firstName, String lastName, String username, String password, List<AccountRequest> accounts) {
        this.id= id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.accounts = accounts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<AccountRequest> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountRequest> accounts) {
        this.accounts = accounts;
    }
}
