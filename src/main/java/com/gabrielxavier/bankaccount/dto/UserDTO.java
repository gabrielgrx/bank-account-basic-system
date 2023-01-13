package com.gabrielxavier.bankaccount.dto;

import com.gabrielxavier.bankaccount.model.entities.User;

import java.io.Serializable;

public class UserDTO implements Serializable {

    private String name;
    private String cpf;
    private String email;
    private String phone;

    public UserDTO() {
    }

    public UserDTO(User obj) {
        name = obj.getName();
        cpf = obj.getCpf();
        email = obj.getEmail();
        phone = obj.getPhone();
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
}
