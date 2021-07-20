package com.nocservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nocservice.model.ServiceEntity;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceEntity, String>  {

}