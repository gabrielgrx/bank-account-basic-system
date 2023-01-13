package com.gabrielxavier.bankaccount.dto;

import com.gabrielxavier.bankaccount.model.entities.Address;

import java.io.Serializable;

public class AddressDTO implements Serializable {

    private Long id;
    private String street;
    private Integer number;
    private String city;
    private String state;
    private String country;

    public AddressDTO() {
    }

    public AddressDTO(Address address) {
        id = address.getId();
        street = address.getStreet();
        number = address.getNumber();
        city = address.getCity();
        street = address.getState();
        country = address.getCountry();
    }

    public Long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
