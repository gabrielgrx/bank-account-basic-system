package com.gabrielxavier.bankaccount.repositories;

import com.gabrielxavier.bankaccount.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
