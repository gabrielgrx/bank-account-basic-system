package com.gabrielxavier.bankaccount.dto;

import com.gabrielxavier.bankaccount.model.Account;
import com.gabrielxavier.bankaccount.model.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRequestDTO implements Serializable {

    @NotBlank
    private String name;

    @NotBlank
    @CPF(message = "Invalid CPF")
    private String cpf;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String phone;

    private Address address;

    private Set<Account> accounts = new HashSet<>();
}
