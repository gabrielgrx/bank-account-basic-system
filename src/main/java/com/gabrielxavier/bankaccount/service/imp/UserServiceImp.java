package com.gabrielxavier.bankaccount.service.imp;

import com.gabrielxavier.bankaccount.dto.AddressDTO;
import com.gabrielxavier.bankaccount.dto.UserDTO;
import com.gabrielxavier.bankaccount.model.User;
import com.gabrielxavier.bankaccount.repository.UserRepository;
import com.gabrielxavier.bankaccount.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> list = userRepository.findAll();
        List<UserDTO> listDTO = list.stream().map(x -> toUserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(listDTO);
    }

    @Override
    public ResponseEntity<UserDTO> findByCpf(String cpf) {
        User client = userRepository.findByCpf(cpf);
        UserDTO clientDTO = toUserDTO(client);
        return ResponseEntity.status(HttpStatus.OK).body(clientDTO);
    }

    @Override
    public ResponseEntity<UserDTO> saveUser(UserDTO userDTO) {
        User newUser = fromUserDTO(userDTO);
        userRepository.save(newUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(userDTO);
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
