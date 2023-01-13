package com.gabrielxavier.bankaccount.services;

import com.gabrielxavier.bankaccount.model.entities.Address;
import com.gabrielxavier.bankaccount.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    public Address findById(Long id) {
        Optional<Address> obj = repository.findById(id);
        return obj.get();
    }
}
