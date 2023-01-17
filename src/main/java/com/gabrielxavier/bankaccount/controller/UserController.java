package com.gabrielxavier.bankaccount.controller;

import com.gabrielxavier.bankaccount.dto.UserRequestDTO;
import com.gabrielxavier.bankaccount.dto.UserResponseDTO;
import com.gabrielxavier.bankaccount.repository.UserRepository;
import com.gabrielxavier.bankaccount.service.imp.UserServiceImp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImp userServiceImp;
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(userServiceImp.findAll());
    }

    @GetMapping(value = "/{cpf}")
    public ResponseEntity<UserResponseDTO> findByUserCpf(@PathVariable String cpf) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userServiceImp.findByCpf(cpf));
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> addUser(@RequestBody @Valid UserRequestDTO userRequestDTO) {
        UserResponseDTO userResponseDTO = userServiceImp.addUser(userRequestDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{cpf}").buildAndExpand(userResponseDTO.getCpf()).toUri();
        return ResponseEntity.created(uri).body(userResponseDTO);
    }
}
