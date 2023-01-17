package com.gabrielxavier.bankaccount.service.imp;

import com.gabrielxavier.bankaccount.dto.UserDTOConverter;
import com.gabrielxavier.bankaccount.dto.UserRequestDTO;
import com.gabrielxavier.bankaccount.dto.UserResponseDTO;
import com.gabrielxavier.bankaccount.model.User;
import com.gabrielxavier.bankaccount.model.exceptions.CpfNotFoundException;
import com.gabrielxavier.bankaccount.repository.UserRepository;
import com.gabrielxavier.bankaccount.service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    private UserDTOConverter userDTOConverter;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserResponseDTO> findAll() {
        List<User> list = userRepository.findAll();
        List<UserResponseDTO> userResponseDTOS = list.stream().map(x -> userDTOConverter.modelToResponse(x)).collect(Collectors.toList());
        return userResponseDTOS;
    }

    @Override
    public UserResponseDTO findByCpf(String cpf) {
        User user = userRepository.findByCpf(cpf).orElseThrow(() -> new CpfNotFoundException("CPF Not Found!"));
        UserResponseDTO userResponseDTO = userDTOConverter.modelToResponse(user);
        return userResponseDTO;
    }

    @Override
    public UserResponseDTO addUser(UserRequestDTO userRequestDTO) {
        User newUser = userDTOConverter.requestToModel(userRequestDTO);
        userRepository.save(newUser);
        UserResponseDTO newUserResponseDTO = userDTOConverter.modelToResponse(newUser);
        return newUserResponseDTO;
    }
}
