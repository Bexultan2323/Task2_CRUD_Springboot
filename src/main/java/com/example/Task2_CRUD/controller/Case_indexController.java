package com.example.Task2_CRUD.controller;

import com.example.Task2_CRUD.model.Case_index;
import com.example.Task2_CRUD.service.Case_indexService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Case_indexController {
    private final Case_indexService case_indexService;


    public Case_indexController(Case_indexService case_indexService) {
        this.case_indexService = case_indexService;
    }

    @GetMapping("/api/case_index")
    public ResponseEntity<?> getCase_index(){
        return ResponseEntity.ok(case_indexService.getAll());
    }

    @GetMapping("/api/case_index/{id}")
    public ResponseEntity<?> getCase_index(@PathVariable Long id){
        return ResponseEntity.ok(case_indexService.getById(id));
    }

    @PostMapping("/api/case_index")
    public ResponseEntity<?>  saveCase_index(@RequestBody Case_index case_Index){
        return ResponseEntity.ok(case_indexService.create(case_Index));
    }

    @PutMapping("/api/case_index")
    public ResponseEntity<?> updateCase_index(@RequestBody Case_index case_Index){
        return ResponseEntity.ok(case_indexService.update(case_Index));
    }

    @DeleteMapping("/api/case_index/{id}")
    public void deleteCase_index(@PathVariable Long id) {
        case_indexService.delete(id);
    }

}

