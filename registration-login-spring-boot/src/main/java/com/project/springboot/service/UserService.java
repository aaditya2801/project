package com.project.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.project.springboot.model.User;
import com.project.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
