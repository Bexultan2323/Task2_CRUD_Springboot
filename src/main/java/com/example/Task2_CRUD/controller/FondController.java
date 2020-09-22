package com.example.Task2_CRUD.controller;

import com.example.Task2_CRUD.model.Fond;
import com.example.Task2_CRUD.service.FondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FondController {

    @Autowired
    private final FondService fondService;

    public FondController(FondService fondService) {
        this.fondService = fondService;
    }

    @GetMapping("/api/fonds/{fondId}")
    public ResponseEntity<?> getFond(@PathVariable Long fondId) {
        return ResponseEntity.ok(fondService.getById(fondId));
    }

    @GetMapping("/api/fonds")
    public ResponseEntity<?> getFond() {
        return ResponseEntity.ok(fondService.getAll());
    }

    @PostMapping("/api/fonds")
    public ResponseEntity<?> saveFond(@RequestBody Fond fond) {
        return ResponseEntity.ok(fondService.create(fond));
    }
}
