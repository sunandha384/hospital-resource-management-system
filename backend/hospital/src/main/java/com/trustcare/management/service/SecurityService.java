package com.trustcare.management.service;

import com.trustcare.management.model.Security;
import com.trustcare.management.repository.SecurityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityService {

    @Autowired
    private SecurityRepository securityRepository;

    public List<Security> getAllSecurity() {
        return securityRepository.findAll();
    }

    public Security saveSecurity(Security security) {
        return securityRepository.save(security);
    }
}