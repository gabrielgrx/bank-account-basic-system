package com.gabrielxavier.bankaccount.dto;

import com.gabrielxavier.bankaccount.entity.enums.AccountType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;

public class AccountDTO {

    @NotBlank
    private Integer agency;

    @NotBlank
    private Integer number;

    @NotBlank
    private Integer checkDigit;

    @NotBlank
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    private Double balance;

    public Integer getAgency() {
        return agency;
    }

    public void setAgency(Integer agency) {
        this.agency = agency;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCheckDigit() {
        return checkDigit;
    }

    public void setCheckDigit(Integer checkDigit) {
        this.checkDigit = checkDigit;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
