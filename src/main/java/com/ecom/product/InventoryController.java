package com.ecom.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/inventory")
public class InventoryController {
    private final InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Inventory>> getAllInventory() {
        List<Inventory> inventories = inventoryService.getAllInventory();
        return ResponseEntity.ok(inventories);
    }
    @GetMapping("/category/{category}")
    public ResponseEntity<List<Inventory>> getInventoryByCategory(@PathVariable String category) {
        List<Inventory> inventories = inventoryService.getInventoryByCategory(category);
        return ResponseEntity.ok(inventories);
    }


}
