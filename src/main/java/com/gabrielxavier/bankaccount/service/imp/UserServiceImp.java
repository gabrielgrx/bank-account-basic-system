package com.gabrielxavier.bankaccount.service.imp;

import com.gabrielxavier.bankaccount.dto.UserDTO;
import com.gabrielxavier.bankaccount.model.User;
import com.gabrielxavier.bankaccount.repository.UserRepository;
import com.gabrielxavier.bankaccount.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public ResponseEntity<UserDTO> findByCpf(String cpf) {
        User client = userRepository.findByCpf(cpf);
        UserDTO clientDTO = toUserDTO(client);
        return ResponseEntity.status(HttpStatus.OK).body(clientDTO);
    }


    private static UserDTO toUserDTO(User user) {
        UserDTO newUserDTO = new UserDTO(user.getName(), user.getCpf(), user.getEmail(), user.getPhone(), user.getAddress());
        return newUserDTO;
    }

    private static User fromUserDTO(UserDTO userDTO) {
        User newUser = new User(userDTO.getName(), userDTO.getCpf(), userDTO.getEmail(), userDTO.getPhone(), userDTO.getAddress());
        return newUser;
    }
}
