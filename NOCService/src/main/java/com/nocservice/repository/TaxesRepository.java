package com.nocservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nocservice.model.TaxesEntity;

@Repository
public interface TaxesRepository extends JpaRepository<TaxesEntity, String>  {

}