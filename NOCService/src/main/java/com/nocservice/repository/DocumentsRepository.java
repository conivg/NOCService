package com.nocservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nocservice.model.DocumentEntity;

@Repository
public interface DocumentsRepository extends JpaRepository<DocumentEntity, Integer>  {

}