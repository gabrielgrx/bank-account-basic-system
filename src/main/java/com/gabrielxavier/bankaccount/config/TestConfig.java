package com.gabrielxavier.bankaccount.config;

import com.gabrielxavier.bankaccount.entity.Account;
import com.gabrielxavier.bankaccount.entity.Address;
import com.gabrielxavier.bankaccount.entity.User;
import com.gabrielxavier.bankaccount.entity.enums.AccountType;
import com.gabrielxavier.bankaccount.repository.AccountRepository;
import com.gabrielxavier.bankaccount.repository.AddressRepository;
import com.gabrielxavier.bankaccount.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void run(String... args) throws Exception {

        accountRepository.deleteAll();
        userRepository.deleteAll();
        addressRepository.deleteAll();

        Address ad1 = new Address("rua bonita", 123, "Londrina", "Parana", "Brasil");
        Address ad2 = new Address("Avenida Europa", 1388, "São Paulo", "São Paulo", "Brasil");

        addressRepository.saveAll(Arrays.asList(ad1, ad2));

        User u1 = new User("Gabriel", "01023456732", "gabriel@gmail.com", "12345678", ad1);
        User u2 = new User("Roberta", "09876543213", "roberta@gmail.com", "22334455", ad2);
        User u3 = new User("Luis", "12233445566", "luis@gmail.com", "09823412", ad2);

        userRepository.saveAll(Arrays.asList(u1, u2, u3));

        Account ac1 = new Account(1234, 333, 1, AccountType.PERSONAL, 0.0);

        accountRepository.save(ac1);



    }
}
