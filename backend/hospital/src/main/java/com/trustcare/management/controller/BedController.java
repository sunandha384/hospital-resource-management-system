package com.trustcare.management.controller;

import com.trustcare.management.model.Bed;
import com.trustcare.management.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api/beds")
public class BedController {

    @Autowired
    private BedService bedService;

    @GetMapping
    public List<Bed> getAllBeds() {
        return bedService.getAllBeds();
    }

    @PostMapping
    public Bed saveBed(@RequestBody Bed bed) {
        return bedService.saveBed(bed);
    }
}