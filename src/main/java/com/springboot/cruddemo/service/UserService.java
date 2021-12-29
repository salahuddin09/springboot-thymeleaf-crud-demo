package com.springboot.cruddemo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.springboot.cruddemo.dto.UserRegistrationDto;
import com.springboot.cruddemo.model.User;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}