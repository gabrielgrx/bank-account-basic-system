package com.gabrielxavier.bankaccount.dto;

import com.gabrielxavier.bankaccount.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDTOConverter {

    public UserResponseDTO modelToResponse(User user) {
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setName(user.getName());
        userResponseDTO.setCpf(user.getCpf());
        userResponseDTO.setEmail(user.getEmail());
        userResponseDTO.setPhone(user.getPhone());
        userResponseDTO.setAddress(user.getAddress());
        return userResponseDTO;
    }

    public User responseToModel(UserResponseDTO userResponseDTO) {
        User user = new User();
        user.setName(userResponseDTO.getName());
        user.setCpf(userResponseDTO.getCpf());
        user.setEmail(userResponseDTO.getEmail());
        user.setPhone(userResponseDTO.getPhone());
        user.setAddress(userResponseDTO.getAddress());
        return user;
    }

    public UserRequestDTO modelToRequest(User user) {
        UserRequestDTO userRequestDTO = new UserRequestDTO();
        userRequestDTO.setName(user.getName());
        userRequestDTO.setCpf(user.getCpf());
        userRequestDTO.setEmail(user.getEmail());
        userRequestDTO.setPhone(user.getPhone());
        userRequestDTO.setAddress(user.getAddress());
        return userRequestDTO;
    }

    public User requestToModel(UserRequestDTO userRequestDTO) {
        User user = new User();
        user.setName(userRequestDTO.getName());
        user.setCpf(userRequestDTO.getCpf());
        user.setEmail(userRequestDTO.getEmail());
        user.setPhone(userRequestDTO.getPhone());
        user.setAddress(userRequestDTO.getAddress());
        return user;
    }
}
