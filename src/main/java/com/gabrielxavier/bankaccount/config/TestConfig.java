package com.gabrielxavier.bankaccount.config;

import com.gabrielxavier.bankaccount.model.entities.User;
import com.gabrielxavier.bankaccount.repositories.UserRepository;
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

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User("Gabriel", "01023456732", "gabriel@gmail.com", "99660088");
        User u2 = new User("Roberta", "09876543213", "roberta@gmail.com", "22334455");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
