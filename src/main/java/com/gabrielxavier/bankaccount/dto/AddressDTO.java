package com.gabrielxavier.bankaccount.dto;

import com.gabrielxavier.bankaccount.model.Address;
import com.gabrielxavier.bankaccount.model.User;
import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddressDTO implements Serializable {

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
