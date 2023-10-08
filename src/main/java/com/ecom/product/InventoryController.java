package com.ecom.product;

import io.swagger.models.Model;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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


    @PostMapping("/addProduct/")
    public ResponseEntity<Inventory> addInventory(@RequestBody Inventory newInventory) {
        Inventory savedInventory = inventoryService.addInventory(newInventory);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedInventory);
    }



    @GetMapping(value = "/image/{imageName}", produces = MediaType.IMAGE_JPEG_VALUE)

    public void getImage(@PathVariable String imageName, HttpServletResponse response) throws IOException {
        var imgFile = new ClassPathResource("image/" + imageName);

        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
        StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
    }


    }




