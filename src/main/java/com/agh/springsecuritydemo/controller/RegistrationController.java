package com.agh.springsecuritydemo.controller;

import com.agh.springsecuritydemo.dto.UserDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @RequestMapping(value = "/user/registration", method = RequestMethod.POST)
    public UserDto showRegistrationForm(@RequestBody UserDto userDto) {
        return userDto;
    }

}
