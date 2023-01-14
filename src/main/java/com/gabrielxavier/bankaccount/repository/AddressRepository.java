package com.gabrielxavier.bankaccount.repository;

import com.gabrielxavier.bankaccount.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
