package com.gabrielxavier.bankaccount.contoller;

import com.gabrielxavier.bankaccount.dto.UserDTO;
import com.gabrielxavier.bankaccount.service.imp.UserServiceImp;
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
    private UserServiceImp userServiceImp;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        return userServiceImp.findAll();
    }

    @GetMapping(value = "/{cpf}")
    public ResponseEntity<UserDTO> findByUserCpf(@PathVariable String cpf) {
        return userServiceImp.findByCpf(cpf);
    }
}
