package com.nocservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nocservice.model.PriceEntity;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, String>  {

}