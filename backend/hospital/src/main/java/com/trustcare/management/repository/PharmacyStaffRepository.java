package com.trustcare.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trustcare.management.model.PharmacyStaff;

@Repository
public interface PharmacyStaffRepository
        extends JpaRepository<PharmacyStaff, Long> {

}