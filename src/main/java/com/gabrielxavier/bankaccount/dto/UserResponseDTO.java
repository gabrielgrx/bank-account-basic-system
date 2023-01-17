package com.gabrielxavier.bankaccount.dto;

import com.gabrielxavier.bankaccount.model.Account;
import com.gabrielxavier.bankaccount.model.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
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
public class UserResponseDTO implements Serializable {

    @NotBlank
    private String name;

    @NotBlank
    @CPF(message = "Invalid format CPF")
    private String cpf;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Pattern(regexp = "^\\([1-9]{2}\\) (?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$")
    private String phone;

    private Address address;

    private Set<Account> accounts = new HashSet<>();
}
