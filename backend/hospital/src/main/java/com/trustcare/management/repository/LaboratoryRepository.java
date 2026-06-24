package com.trustcare.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trustcare.management.model.Laboratory;

@Repository
public interface LaboratoryRepository extends JpaRepository<Laboratory, Long> {

}