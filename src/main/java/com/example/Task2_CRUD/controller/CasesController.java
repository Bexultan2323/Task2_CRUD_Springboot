package com.example.Task2_CRUD.controller;

import com.example.Task2_CRUD.model.Cases;
import com.example.Task2_CRUD.service.CasesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CasesController {
    private final CasesService casesService;

    public CasesController(CasesService casesService) {
        this.casesService = casesService;
    }

    @GetMapping("/api/case1")
    public ResponseEntity<?> getCase1(){
        return ResponseEntity.ok(casesService.getAll());
    }

    @GetMapping("/api/case1/{id}")
    public ResponseEntity<?> getCase1(@PathVariable Long id){
        return ResponseEntity.ok(casesService.getById(id));
    }

    @PostMapping("/api/case1")
    public ResponseEntity<?>  saveCase1(@RequestBody Cases case1){
        return ResponseEntity.ok(casesService.create(case1));
    }

    @PutMapping("/api/case1")
    public ResponseEntity<?> updateCase1(@RequestBody Cases case1){
        return ResponseEntity.ok(casesService.update(case1));
    }

    @DeleteMapping("/api/case1/{id}")
    public void deleteCase1(@PathVariable Long id) {
        casesService.delete(id);
    }
}

