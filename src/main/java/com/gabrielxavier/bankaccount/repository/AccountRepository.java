package com.gabrielxavier.bankaccount.repository;

import com.gabrielxavier.bankaccount.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
