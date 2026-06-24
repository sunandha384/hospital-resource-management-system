package com.trustcare.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trustcare.management.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}