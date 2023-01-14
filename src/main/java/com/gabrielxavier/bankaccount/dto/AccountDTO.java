package com.gabrielxavier.bankaccount.dto;

import com.gabrielxavier.bankaccount.model.enums.AccountType;
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
    private String cpf;

    @NotBlank
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    private Double balance;

    private Integer withdrawQuantity;

}
