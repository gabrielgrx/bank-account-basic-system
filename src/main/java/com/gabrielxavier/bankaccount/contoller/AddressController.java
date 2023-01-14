package com.gabrielxavier.bankaccount.contoller;

import com.gabrielxavier.bankaccount.dto.AddressDTO;
import com.gabrielxavier.bankaccount.model.Address;
import com.gabrielxavier.bankaccount.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users/address")
public class AddressController {

    @Autowired
    private AddressService service;

//    @GetMapping(value = "/{id}")
//    public ResponseEntity<AddressDTO> findById(@PathVariable Long id) {
//        Address obj = service.findById(id);
//        return ResponseEntity.ok().body(new AddressDTO(obj));
//    }
}
