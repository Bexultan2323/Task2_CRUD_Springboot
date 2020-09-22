package com.example.Task2_CRUD.controller;

import com.example.Task2_CRUD.model.Catalog_case;
import com.example.Task2_CRUD.service.Catalog_caseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Catalog_caseController {
    private final Catalog_caseService catalog_caseService;

    public Catalog_caseController(Catalog_caseService catalog_caseService) {
        this.catalog_caseService = catalog_caseService;
    }

    @GetMapping("/api/Catalog_case")
    public ResponseEntity<?> getCatalog_case(){
        return ResponseEntity.ok(catalog_caseService.getAll());
    }

    @GetMapping("/api/Catalog_case/{id}")
    public ResponseEntity<?> getCatalog_case(@PathVariable Long id){
        return ResponseEntity.ok(catalog_caseService.getById(id));
    }

    @PostMapping("/api/Catalog_case")
    public ResponseEntity<?>  saveCatalog_case(@RequestBody Catalog_case catalogCase){
        return ResponseEntity.ok(catalog_caseService.create(catalogCase));
    }

    @PutMapping("/api/Catalog_case")
    public ResponseEntity<?> updateCatalog_case(@RequestBody Catalog_case catalogCase){
        return ResponseEntity.ok(catalog_caseService.update(catalogCase));
    }

    @DeleteMapping("/api/Catalog_case/{id}")
    public void deleteCatalog_case(@PathVariable Long id) {
        catalog_caseService.delete(id);
    }
}

