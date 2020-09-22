package com.example.Task2_CRUD.controller;

import com.example.Task2_CRUD.model.Authentication;
import com.example.Task2_CRUD.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping("/api/auth")
    public ResponseEntity<?> getAuth(){
        return ResponseEntity.ok(authenticationService.getAll());
    }

    @GetMapping("/api/auth/{id}")
    public ResponseEntity<?> getAuth(@PathVariable Long id){
        return ResponseEntity.ok(authenticationService.getById(id));
    }

    @PostMapping("/api/auth")
    public ResponseEntity<?> saveAuth(@RequestBody Authentication authentication){
        return ResponseEntity.ok(authenticationService.create(authentication));
    }

    @PutMapping("/api/auth")
    public ResponseEntity<?> updateAuth(@RequestBody Authentication authentication){
        return ResponseEntity.ok(authenticationService.update(authentication));
    }

    @DeleteMapping("/api/auth/{id}")
    public void deleteAuth(@PathVariable Long id) {
        authenticationService.delete(id);
    }
}

