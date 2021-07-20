package com.nocservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nocservice.model.TaxesTypeEntity;

@Repository
public interface TaxesTypeRepository extends JpaRepository<TaxesTypeEntity, String>  {

}