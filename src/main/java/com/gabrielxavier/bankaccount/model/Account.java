package com.gabrielxavier.bankaccount.model;

import com.gabrielxavier.bankaccount.model.enums.AccountType;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_account")
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer agency;

    @Column(nullable = false)
    private Integer number;

    @Column(nullable = false)
    private Integer checkDigit;

    @Column(unique = true)
    private String cpf;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @Column
    private Double balance;

    @Column
    private Integer withdrawQuantity;

    @ManyToOne
    private User client;

    public Account() {
    }

    public Account(Integer agency, Integer number, Integer checkDigit, Integer withdrawQuantity, AccountType accountType, User client) {
        this.agency = agency;
        this.number = number;
        this.checkDigit = checkDigit;
        this.withdrawQuantity = withdrawQuantity;
        this.accountType = accountType;
        this.client = client;
        this.cpf = client.getCpf();
        this.balance = 0.0;
    }

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

    public Integer getWithdrawQuantity() {
        return withdrawQuantity;
    }

    public void setWithdrawQuantity(Integer withdrawQuantity) {
        this.withdrawQuantity = withdrawQuantity;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Long getId() {
        return id;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
