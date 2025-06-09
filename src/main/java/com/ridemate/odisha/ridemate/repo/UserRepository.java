package com.ridemate.odisha.ridemate.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ridemate.odisha.ridemate.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String email);
}
