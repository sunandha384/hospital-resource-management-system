package com.trustcare.management.service;

import com.trustcare.management.model.PharmacyStaff;
import com.trustcare.management.repository.PharmacyStaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacyStaffService {

    @Autowired
    private PharmacyStaffRepository repository;

    public List<PharmacyStaff> getAllStaff() {
        return repository.findAll();
    }
}