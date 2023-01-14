package com.gabrielxavier.bankaccount.contoller;

import com.gabrielxavier.bankaccount.dto.UserDTO;
import com.gabrielxavier.bankaccount.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/{cpf}")
    public ResponseEntity<UserDTO> findByCpf(@PathVariable String cpf) {
        return service.findByCpf(cpf);
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        return service.findAll();
    }
}
