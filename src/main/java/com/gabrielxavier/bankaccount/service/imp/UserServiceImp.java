package com.gabrielxavier.bankaccount.service.imp;

import com.gabrielxavier.bankaccount.entity.exceptions.CpfNotFoundException;
import com.gabrielxavier.bankaccount.service.util.BankAccountDTOConverter;
import com.gabrielxavier.bankaccount.dto.UserDTO;
import com.gabrielxavier.bankaccount.entity.User;
import com.gabrielxavier.bankaccount.repository.UserRepository;
import com.gabrielxavier.bankaccount.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    private BankAccountDTOConverter bankAccountDTOConverter;

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> list = userRepository.findAll();
        List<UserDTO> listDTO = list.stream().map(x -> bankAccountDTOConverter.convertToUserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(listDTO);
    }

    @Override
    public ResponseEntity<UserDTO> findByCpf(String cpf) {
        User user = userRepository.findByCpf(cpf).orElseThrow(() -> new CpfNotFoundException("CPF Not Found!"));
        UserDTO userDTO = bankAccountDTOConverter.convertToUserDTO(user);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userDTO);
    }
}
