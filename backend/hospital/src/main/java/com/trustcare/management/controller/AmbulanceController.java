package com.trustcare.management.controller;

import com.trustcare.management.model.Ambulance;
import com.trustcare.management.service.AmbulanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ambulances")
@CrossOrigin("*")
public class AmbulanceController {

    @Autowired
    private AmbulanceService ambulanceService;

    @GetMapping
    public List<Ambulance> getAllAmbulances() {
        return ambulanceService.getAllAmbulances();
    }

    @PostMapping
    public Ambulance saveAmbulance(@RequestBody Ambulance ambulance) {
        return ambulanceService.saveAmbulance(ambulance);
    }
}