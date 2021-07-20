package com.nocservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nocservice.model.PermissionEntity;

@Repository
public interface PermissionRepository extends JpaRepository<PermissionEntity, String>  {

}