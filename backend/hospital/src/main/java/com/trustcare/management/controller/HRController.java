package com.trustcare.management.controller;

import com.trustcare.management.model.HR;
import com.trustcare.management.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hr")
@CrossOrigin("*")
public class HRController {

    @Autowired
    private HRService hrService;

    @GetMapping
    public List<HR> getAllHR() {
        return hrService.getAllHR();
    }

    @PostMapping
    public HR saveHR(@RequestBody HR hr) {
        return hrService.saveHR(hr);
    }
}