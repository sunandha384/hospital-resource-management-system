package com.trustcare.management.service;

import com.trustcare.management.model.Bed;
import com.trustcare.management.repository.BedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedService {

    @Autowired
    private BedRepository bedRepository;

    public List<Bed> getAllBeds() {
        return bedRepository.findAll();
    }

    public Bed saveBed(Bed bed) {
        return bedRepository.save(bed);
    }
}