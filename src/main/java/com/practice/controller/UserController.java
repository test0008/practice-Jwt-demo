package com.practice.controller;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entites.User;
import com.practice.services.UserService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/jwt-practice/users")
public class UserController {

@Autowired
private UserService userService;
	
	public UserController (UserService userService) {
		this.userService = userService;
	}
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping(value = "/current-user" )
	public String getLoggedInUser(Principal principal) {
		String userName = principal.getName();
		log.info("Logged in Username : {}", userName);
		return userName;
	}
	
	@GetMapping(value = "/test")
	public String getTest() {
		return "Test Successful";
	}
	
	@PostMapping()
	public User createUser(@RequestBody User user) {
		log.info("createUser() Given User details : {}", user);
		User userSaved = userService.saveUser(user);
		log.info("createUser() Saved User details : {}", userSaved);
		return userSaved;
	}
	
	@GetMapping()
	public List<User> getUsers(){
		List<User> userList = userService.findAllUsers();
		log.info("getUsers() All Users data : {}", userList);
		return userList;
	}
	
	@GetMapping("/{id}")
	public User getUserById (@PathVariable int id){
		User user = userService.findByIdUser(id);
		log.info("getUserById() Users data : {}", user);
		return user;
	}
}
