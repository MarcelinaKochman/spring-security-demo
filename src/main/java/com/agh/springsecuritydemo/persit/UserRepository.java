package com.agh.springsecuritydemo.persit;

import com.agh.springsecuritydemo.dto.UserDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDto, String> {
}
