package com.example.Task2_CRUD.controller;


import com.example.Task2_CRUD.model.Nomenclature;
import com.example.Task2_CRUD.service.NomenclatureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NomenclatureController {
    private final NomenclatureService nomenclatureService;

    public NomenclatureController(NomenclatureService nomenclatureService) {
        this.nomenclatureService = nomenclatureService;
    }

    @GetMapping("/api/Nomenclature")
    public ResponseEntity<?> getNomenclature(){
        return ResponseEntity.ok(nomenclatureService.getAll());
    }

    @GetMapping("/api/Nomenclature/{id}")
    public ResponseEntity<?> getNomenclature(@PathVariable Long id){
        return ResponseEntity.ok(nomenclatureService.getById(id));
    }

    @PostMapping("/api/Nomenclature")
    public ResponseEntity<?>  saveNomenclature(@RequestBody Nomenclature nomenclature){
        return ResponseEntity.ok(nomenclatureService.create(nomenclature));
    }

    @PutMapping("/api/Nomenclature")
    public ResponseEntity<?> updateNomenclature(@RequestBody Nomenclature nomenclature){
        return ResponseEntity.ok(nomenclatureService.update(nomenclature));
    }

    @DeleteMapping("/api/Nomenclature/{id}")
    public void deleteNomenclature(@PathVariable Long id) {
        nomenclatureService.delete(id);
    }
}


