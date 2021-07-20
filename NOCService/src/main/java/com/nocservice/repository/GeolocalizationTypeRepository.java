package com.nocservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nocservice.model.GeolocalizationTypeEntity;

@Repository
public interface GeolocalizationTypeRepository extends JpaRepository<GeolocalizationTypeEntity, String>  {

}