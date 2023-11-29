package com.rojatech.lms.sivagami.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rojatech.lms.sivagami.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);	
}
