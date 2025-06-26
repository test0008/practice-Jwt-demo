package com.practice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entites.User;
import com.practice.repositories.UserRepository;

@Service
public class UserService{

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser (User user) {
		return userRepository.save(user);
	}
	
	public List<User> findAllUsers () {
		return userRepository.findAll();
	}
	
	public User findByIdUser (int id) {
		return userRepository.findById(id).get();
	}
	

}
