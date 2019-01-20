package com.agh.springsecuritydemo.service;

import com.agh.springsecuritydemo.dto.UserDto;
import com.agh.springsecuritydemo.persit.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto register(UserDto userDto) {
        return userRepository.save(userDto);
    }

}
