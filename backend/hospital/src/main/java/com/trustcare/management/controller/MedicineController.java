package com.trustcare.management.controller;

import com.trustcare.management.model.Medicine;
import com.trustcare.management.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicines")
@CrossOrigin("*")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @GetMapping
    public List<Medicine> getAllMedicines() {
        return medicineService.getAllMedicines();
    }

    @PostMapping
    public Medicine saveMedicine(@RequestBody Medicine medicine) {
        return medicineService.saveMedicine(medicine);
    }
}