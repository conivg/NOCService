package com.nocservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nocservice.model.StatusTypeEntity;

@Repository
public interface StatusTypeRepository extends JpaRepository<StatusTypeEntity, String>  {

}