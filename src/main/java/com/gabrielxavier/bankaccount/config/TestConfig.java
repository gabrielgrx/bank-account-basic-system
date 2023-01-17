package com.gabrielxavier.bankaccount.config;

import com.gabrielxavier.bankaccount.model.Account;
import com.gabrielxavier.bankaccount.model.Address;
import com.gabrielxavier.bankaccount.model.User;
import com.gabrielxavier.bankaccount.model.enums.AccountType;
import com.gabrielxavier.bankaccount.repository.AccountRepository;
import com.gabrielxavier.bankaccount.repository.AddressRepository;
import com.gabrielxavier.bankaccount.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void run(String... args) throws Exception {
//
//        accountRepository.deleteAll();
//        userRepository.deleteAll();
//        addressRepository.deleteAll();
//
//        Address ad1 = new Address(null, "rua bonita", 123, "Londrina", "Parana", "Brasil", null);
//        Address ad2 = new Address(null, "Avenida Europa", 1388, "São Paulo", "São Paulo", "Brasil", null);
//
//        addressRepository.saveAll(Arrays.asList(ad1, ad2));
//
//        User u1 = new User(null, "Gabriel", "09174485962", "gabriel@gmail.com", "12345678", ad1, null);
//        User u2 = new User(null, "Roberta", "09174485963", "roberta@gmail.com", "22334455", ad2, null);
//        User u3 = new User(null, "Luis", "09174485964", "luis@gmail.com", "09823412", ad2, null);
//
//        userRepository.saveAll(Arrays.asList(u1, u2, u3));
//
//        Account ac1 = new Account(null, 1234, 333, 1, AccountType.PERSONAL, 0.0, null);
//
//        accountRepository.save(ac1);

    }
}
