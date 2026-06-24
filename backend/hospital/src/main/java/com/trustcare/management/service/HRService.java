package com.trustcare.management.service;

import com.trustcare.management.model.HR;
import com.trustcare.management.repository.HRRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HRService {

    @Autowired
    private HRRepository hrRepository;

    public List<HR> getAllHR() {
        return hrRepository.findAll();
    }

    public HR saveHR(HR hr) {
        return hrRepository.save(hr);
    }
}