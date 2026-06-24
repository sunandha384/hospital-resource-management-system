package com.trustcare.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trustcare.management.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}