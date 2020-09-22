package com.example.Task2_CRUD.controller;

import com.example.Task2_CRUD.model.Catalog;
import com.example.Task2_CRUD.service.CatalogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class CatalogController {
    private final CatalogService catalogService;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/api/Catalog_table")
    public ResponseEntity<?> getCatalog_table(){
        return ResponseEntity.ok(catalogService.getAll());
    }

    @GetMapping("/api/Catalog_table/{id}")
    public ResponseEntity<?> getCatalog_table(@PathVariable Long id){
        return ResponseEntity.ok(catalogService.getById(id));
    }

    @PostMapping("/api/Catalog_table")
    public ResponseEntity<?>  saveCatalog_table(@RequestBody Catalog catalogTable){
        return ResponseEntity.ok(catalogService.create(catalogTable));
    }

    @PutMapping("/api/Catalog_table")
    public ResponseEntity<?> updateCatalog_table(@RequestBody Catalog catalogTable){
        return ResponseEntity.ok(catalogService.update(catalogTable));
    }

    @DeleteMapping("/api/Catalog_table/{id}")
    public void deleteCatalog_table(@PathVariable Long id) {
        catalogService.delete(id);
    }
}

