package com.gabrielxavier.bankaccount.repositories;

import com.gabrielxavier.bankaccount.model.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
