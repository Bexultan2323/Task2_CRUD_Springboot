package com.example.Task2_CRUD.controller;

import com.example.Task2_CRUD.model.History_request;
import com.example.Task2_CRUD.service.History_requestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class History_requestController {
    private final History_requestService history_requestService;

    public History_requestController(History_requestService history_requestService) {
        this.history_requestService = history_requestService;
    }

    @GetMapping("/api/Status_request_history")
    public ResponseEntity<?> getStatus_request_history(){
        return ResponseEntity.ok(history_requestService.getAll());
    }

    @GetMapping("/api/Status_request_history/{id}")
    public ResponseEntity<?> getStatus_request_history(@PathVariable Long id){
        return ResponseEntity.ok(history_requestService.getById(id));
    }

    @PostMapping("/api/Status_request_history")
    public ResponseEntity<?>  saveStatus_request_history(@RequestBody History_request history_request){
        return ResponseEntity.ok(history_requestService.create(history_request));
    }

    @PutMapping("/api/Status_request_history")
    public ResponseEntity<?> updateStatus_request_history(@RequestBody History_request history_request){
        return ResponseEntity.ok(history_requestService.update(history_request));
    }

    @DeleteMapping("/api/Status_request_history/{id}")
    public void deleteStatus_request_history(@PathVariable Long id) {
        history_requestService.delete(id);
    }
}
