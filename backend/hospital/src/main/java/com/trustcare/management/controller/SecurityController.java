package com.trustcare.management.controller;

import com.trustcare.management.model.Security;
import com.trustcare.management.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/security")
@CrossOrigin("*")
public class SecurityController {

    @Autowired
    private SecurityService securityService;

    @GetMapping
    public List<Security> getAllSecurity() {
        return securityService.getAllSecurity();
    }

    @PostMapping
    public Security saveSecurity(@RequestBody Security security) {
        return securityService.saveSecurity(security);
    }
}