package com.trustcare.management.repository;

import com.trustcare.management.model.Radiology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RadiologyRepository extends JpaRepository<Radiology, Long> {

}