package com.nocservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nocservice.model.StatusEntity;

@Repository
public interface StatusRepository extends JpaRepository<StatusEntity, String>  {

}