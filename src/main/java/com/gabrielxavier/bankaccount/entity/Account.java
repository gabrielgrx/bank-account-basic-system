package com.gabrielxavier.bankaccount.entity;

import com.gabrielxavier.bankaccount.entity.enums.AccountType;
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

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @Column
    private Double balance;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private User client;

    public Account() {
    }

    public Account(Integer agency, Integer number, Integer checkDigit, AccountType accountType, Double balance) {
        this.agency = agency;
        this.number = number;
        this.checkDigit = checkDigit;
        this.accountType = accountType;
        this.balance = balance;
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
