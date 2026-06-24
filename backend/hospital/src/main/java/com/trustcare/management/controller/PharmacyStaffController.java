package com.trustcare.management.controller;
import com.trustcare.management.model.PharmacyStaff;
import com.trustcare.management.repository.PharmacyStaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class PharmacyStaffController {

    @Autowired
    private PharmacyStaffRepository repository;

    @GetMapping("/pharmacystaff")
    public List<PharmacyStaff> getAllStaff() {
        return repository.findAll();
    }
}