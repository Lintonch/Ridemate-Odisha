package com.ridemate.odisha.ridemate.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ridemate.odisha.ridemate.repo.UserRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class AuthService {
	
	private final UserRepository repo;
	
	private final PasswordEncoder passwordEncoder;

}
