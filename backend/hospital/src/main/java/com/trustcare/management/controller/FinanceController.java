package com.trustcare.management.controller;

import com.trustcare.management.model.Finance;
import com.trustcare.management.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/finance")
@CrossOrigin("*")
public class FinanceController {

    @Autowired
    private FinanceService financeService;

    @GetMapping
    public List<Finance> getAllFinance() {
        return financeService.getAllFinance();
    }

    @PostMapping
    public Finance saveFinance(@RequestBody Finance finance) {
        return financeService.saveFinance(finance);
    }
}