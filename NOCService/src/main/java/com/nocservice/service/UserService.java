package com.nocservice.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nocservice.dto.UserDto;
import com.nocservice.model.UserEntity;
import com.nocservice.model.UserTypeEntity;
import com.nocservice.repository.UserRepository;
import com.nocservice.repository.UserTypeRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserTypeRepository userTypeRepository;

	@Autowired
	private ModelMapper modelMapper;

	public UserEntity getUserById(Integer id) {
		return userRepository.findById(id).orElse(null);
	}

	@Transactional
	public ResponseEntity<Object> createUser(UserDto user) {
		UserEntity userEntity = getUserById(user.getCode());

		// check if already exists
		if (userEntity == null) {
			userEntity = modelMapper.map(user, UserEntity.class);
			userEntity.setUserTId(getUserType(user.getUserType()));
			userRepository.save(userEntity);
			return new ResponseEntity<>(userEntity, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("User already exists", HttpStatus.CONFLICT);
		}

	}

	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

	@Transactional
	public ResponseEntity<Object> updateUser(UserDto user, Integer id) {
		UserEntity userEntity = getUserById(id);

		if (userEntity != null) {
			userEntity = modelMapper.map(user, UserEntity.class);
			userEntity.setUserTId(getUserType(user.getUserType()));
			userEntity.setCode(id);
			userRepository.save(userEntity);
			return new ResponseEntity<>(userEntity, HttpStatus.OK);
		} else {
			return new ResponseEntity<>("That user doesnt exists", HttpStatus.NOT_FOUND);
		}

	}

	public ResponseEntity<Object> deleteUser(Integer id) {
		UserEntity userEntity = getUserById(id);

		if (userEntity != null) {
			userRepository.deleteById(id);
			return new ResponseEntity<>("User with id " + id + " deleted.", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("That user doesnt exists", HttpStatus.NOT_FOUND);
		}
	}

	public UserTypeEntity getUserType(Integer id) {
		return userTypeRepository.findById(id).orElse(null);
	}
}
