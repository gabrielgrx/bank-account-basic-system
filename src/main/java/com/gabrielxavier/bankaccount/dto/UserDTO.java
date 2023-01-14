package com.gabrielxavier.bankaccount.dto;

import com.gabrielxavier.bankaccount.model.Account;
import com.gabrielxavier.bankaccount.model.Address;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class UserDTO implements Serializable {

    @NotBlank
    private String name;

    @NotBlank
    @Size(max = 11)
    private String cpf;

    @NotBlank
    private String email;

    @NotBlank
    private String phone;

    private Address address;

    private Set<Account> accounts = new HashSet<>();

    public UserDTO() {
    }

    public UserDTO(String name, String cpf, String email, String phone, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }
}
