package com.gabrielxavier.bankaccount.service;

import com.gabrielxavier.bankaccount.dto.UserRequestDTO;
import com.gabrielxavier.bankaccount.dto.UserResponseDTO;

import java.util.List;

public interface UserService {

    List<UserResponseDTO> findAll();

    UserResponseDTO findByCpf(String cpf);

    UserResponseDTO addUser(UserRequestDTO userRequestDTO);
}
