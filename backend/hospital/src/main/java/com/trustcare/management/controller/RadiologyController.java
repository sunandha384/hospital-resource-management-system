package com.trustcare.management.controller;

import com.trustcare.management.model.Radiology;
import com.trustcare.management.service.RadiologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/radiology")
@CrossOrigin("*")
public class RadiologyController {

    @Autowired
    private RadiologyService radiologyService;

    @GetMapping
    public List<Radiology> getAllRadiology() {
        return radiologyService.getAllRadiology();
    }

    @PostMapping
    public Radiology saveRadiology(@RequestBody Radiology radiology) {
        return radiologyService.saveRadiology(radiology);
    }
}