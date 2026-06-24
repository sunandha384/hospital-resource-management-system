package com.trustcare.management.controller;

import com.trustcare.management.model.Reception;
import com.trustcare.management.service.ReceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reception")
@CrossOrigin("*")
public class ReceptionController {

    @Autowired
    private ReceptionService receptionService;

    @GetMapping
    public List<Reception> getAllReceptionStaff() {
        return receptionService.getAllReceptionStaff();
    }

    @PostMapping
    public Reception saveReceptionStaff(@RequestBody Reception reception) {
        return receptionService.saveReceptionStaff(reception);
    }
}