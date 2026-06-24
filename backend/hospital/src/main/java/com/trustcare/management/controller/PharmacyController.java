package com.trustcare.management.controller;

import com.trustcare.management.model.Pharmacy;
import com.trustcare.management.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pharmacy")
@CrossOrigin("*")
public class PharmacyController {

    @Autowired
    private PharmacyService pharmacyService;

    @GetMapping
    public List<Pharmacy> getAllPharmacy() {
        return pharmacyService.getAllPharmacy();
    }

    @PostMapping
    public Pharmacy savePharmacy(@RequestBody Pharmacy pharmacy) {
        return pharmacyService.savePharmacy(pharmacy);
    }
}