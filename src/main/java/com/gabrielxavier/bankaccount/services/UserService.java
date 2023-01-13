package com.gabrielxavier.bankaccount.services;

import com.gabrielxavier.bankaccount.model.entities.User;
import com.gabrielxavier.bankaccount.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
