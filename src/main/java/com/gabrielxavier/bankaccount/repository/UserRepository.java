package com.gabrielxavier.bankaccount.repository;

import com.gabrielxavier.bankaccount.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByCpf(String cpf);
}
