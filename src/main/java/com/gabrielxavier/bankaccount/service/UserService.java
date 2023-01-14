package com.gabrielxavier.bankaccount.service;

import com.gabrielxavier.bankaccount.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserService {

    ResponseEntity<List<UserDTO>> findAll();

    ResponseEntity<UserDTO> findByCpf(String cpf);

    ResponseEntity<UserDTO> saveUser(UserDTO userDTO);
}
