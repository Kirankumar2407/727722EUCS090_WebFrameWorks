package com.example.cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cw1.model.Medicine;
// import com.example.cw1.repository.MedicineRepo;
import com.example.cw1.repository.MedicineRepository;

@Service
public class MedicineService {
    @Autowired
    private MedicineRepository medicineRepo;

    public Medicine createMedicine(Medicine medicine) {
        return medicineRepo.save(medicine);
    }

    public List<Medicine> getAllMedicines() {
        return (List<Medicine>) MedicineRepository.findAll();
    }

    public Medicine getMedicineById(int medicineId) {
        return medicineRepo.findById(medicineId).orElse(null);
    }
}
