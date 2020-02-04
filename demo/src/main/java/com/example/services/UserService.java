package com.example.services;

import com.example.dto.UserDTO;
import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserDTO salvar(UserDTO userDTO) {
        userRepository.save(new User(userDTO));
        return userDTO;
    }
}
