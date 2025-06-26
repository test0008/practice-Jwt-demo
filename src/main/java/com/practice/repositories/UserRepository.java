package com.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.entites.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}
