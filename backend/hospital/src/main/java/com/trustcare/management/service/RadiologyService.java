package com.trustcare.management.service;

import com.trustcare.management.model.Radiology;
import com.trustcare.management.repository.RadiologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RadiologyService {

    @Autowired
    private RadiologyRepository radiologyRepository;

    public List<Radiology> getAllRadiology() {
        return radiologyRepository.findAll();
    }

    public Radiology saveRadiology(Radiology radiology) {
        return radiologyRepository.save(radiology);
    }
}