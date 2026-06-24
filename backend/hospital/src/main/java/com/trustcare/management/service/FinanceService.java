package com.trustcare.management.service;

import com.trustcare.management.model.Finance;
import com.trustcare.management.repository.FinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceService {

    @Autowired
    private FinanceRepository financeRepository;

    public List<Finance> getAllFinance() {
        return financeRepository.findAll();
    }

    public Finance saveFinance(Finance finance) {
        return financeRepository.save(finance);
    }
}