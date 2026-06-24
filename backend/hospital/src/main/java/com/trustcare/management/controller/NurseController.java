package com.trustcare.management.controller;

import com.trustcare.management.model.Nurse;
import com.trustcare.management.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nurses")
@CrossOrigin("*")
public class NurseController {

    @Autowired
    private NurseService nurseService;

    @GetMapping
    public List<Nurse> getAllNurses() {
        return nurseService.getAllNurses();
    }

    @PostMapping
    public Nurse saveNurse(@RequestBody Nurse nurse) {
        return nurseService.saveNurse(nurse);
    }
}