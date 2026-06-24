package com.trustcare.management.controller;

import com.trustcare.management.model.Housekeeping;
import com.trustcare.management.service.HousekeepingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/housekeeping")
@CrossOrigin("*")
public class HousekeepingController {

    @Autowired
    private HousekeepingService housekeepingService;

    @GetMapping
    public List<Housekeeping> getAllHousekeeping() {
        return housekeepingService.getAllHousekeeping();
    }

    @PostMapping
    public Housekeeping saveHousekeeping(@RequestBody Housekeeping housekeeping) {
        return housekeepingService.saveHousekeeping(housekeeping);
    }
}