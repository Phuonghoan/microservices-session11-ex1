package org.example.inventoryservice.controller;

import org.example.inventoryservice.entity.Medicine;
import org.example.inventoryservice.service.InventoryService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/medicines")
public class MedicineController {

    private final InventoryService inventoryService;

    public MedicineController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/{id}")
    public Medicine getMedicineById(@PathVariable Long id) {

        return inventoryService.getMedicineById(id);
    }
}
