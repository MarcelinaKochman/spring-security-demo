package com.agh.springsecuritydemo.controller;

import com.agh.springsecuritydemo.dto.UserDto;
import com.agh.springsecuritydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/registration", method = RequestMethod.POST)
    public UserDto showRegistrationForm(@RequestBody @Valid UserDto userDto) {
        return userService.register(userDto);
    }

}
