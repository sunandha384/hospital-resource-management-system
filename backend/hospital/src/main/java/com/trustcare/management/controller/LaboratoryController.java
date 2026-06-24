package com.trustcare.management.controller;

import com.trustcare.management.model.Laboratory;
import com.trustcare.management.service.LaboratoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laboratory")
@CrossOrigin("*")
public class LaboratoryController {

    @Autowired
    private LaboratoryService laboratoryService;

    @GetMapping
    public List<Laboratory> getAllLaboratories() {
        return laboratoryService.getAllLaboratories();
    }

    @PostMapping
    public Laboratory saveLaboratory(@RequestBody Laboratory laboratory) {
        return laboratoryService.saveLaboratory(laboratory);
    }
}