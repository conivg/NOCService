package com.nocservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nocservice.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>  {

}