package com.trustcare.management.service;

import com.trustcare.management.model.Reception;
import com.trustcare.management.repository.ReceptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptionService {

    @Autowired
    private ReceptionRepository receptionRepository;

    public List<Reception> getAllReceptionStaff() {
        return receptionRepository.findAll();
    }

    public Reception saveReceptionStaff(Reception reception) {
        return receptionRepository.save(reception);
    }
}