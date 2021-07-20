package com.nocservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nocservice.model.MovementEntity;

@Repository
public interface MovementRepository extends JpaRepository<MovementEntity, String>  {

}