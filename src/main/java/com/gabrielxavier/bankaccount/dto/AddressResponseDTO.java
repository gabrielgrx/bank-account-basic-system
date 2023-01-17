package com.gabrielxavier.bankaccount.dto;

import com.gabrielxavier.bankaccount.model.User;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddressResponseDTO implements Serializable {

    @NotBlank
    private String street;

    @NotBlank
    private Integer number;

    @NotBlank
    private String city;

    @NotBlank
    private String state;

    @NotBlank
    private String country;

    private List<User> clients = new ArrayList<>();
}
