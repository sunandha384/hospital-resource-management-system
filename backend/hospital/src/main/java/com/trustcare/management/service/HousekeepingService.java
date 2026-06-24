package com.trustcare.management.service;

import com.trustcare.management.model.Housekeeping;
import com.trustcare.management.repository.HousekeepingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HousekeepingService {

    @Autowired
    private HousekeepingRepository housekeepingRepository;

    public List<Housekeeping> getAllHousekeeping() {
        return housekeepingRepository.findAll();
    }

    public Housekeeping saveHousekeeping(Housekeeping housekeeping) {
        return housekeepingRepository.save(housekeeping);
    }
}