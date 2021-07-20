package com.nocservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nocservice.model.UserTypeEntity;

@Repository
public interface UserTypeRepository extends JpaRepository<UserTypeEntity, Integer>  {

}
