package com.gabrielxavier.bankaccount.service;

import com.gabrielxavier.bankaccount.dto.UserDTO;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<UserDTO> findByCpf(String cpf);
}
