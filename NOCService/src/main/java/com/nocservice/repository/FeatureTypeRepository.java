package com.nocservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nocservice.model.FeatureTypeEntity;

@Repository
public interface FeatureTypeRepository extends JpaRepository<FeatureTypeEntity, String>  {

}