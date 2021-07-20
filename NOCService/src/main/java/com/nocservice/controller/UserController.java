package com.nocservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nocservice.dto.UserDto;
import com.nocservice.model.UserEntity;
import com.nocservice.service.UserService;

@RestController
@RequestMapping("${api.version}")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/user", produces = "application/json")
	public UserEntity getUserById(Integer id) throws Exception {
		return userService.getUserById(id);
	}
	
	@GetMapping(value = "/users", produces = "application/json")
	public List<UserEntity> getAllUsers() throws Exception {
		return userService.getAllUsers();
	}
	
	@PostMapping(value = "/user", produces = "application/json")
	public ResponseEntity<Object> createUser(@RequestBody UserDto userDto) throws Exception {
		return userService.createUser(userDto);
	}
	
	@PutMapping(value="user")
	public ResponseEntity<Object> updateUser(@RequestBody UserDto userDto) throws Exception {
		return userService.updateUser(userDto);
	}
	
}
