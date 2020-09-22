package com.example.Task2_CRUD.controller;

import com.example.Task2_CRUD.model.Activity_journal;
import com.example.Task2_CRUD.service.Activity_journalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Activity_journalController {

    private final Activity_journalService activity_journalService;


    public Activity_journalController(Activity_journalService activity_journalService) {
        this.activity_journalService = activity_journalService;
    }
    @GetMapping("/api/activityJournal/{id}")
    public ResponseEntity<?> getActivate_journal(@PathVariable Long id) {
        return ResponseEntity.ok(activity_journalService.getById(id));
    }

    @GetMapping("/api/activityJournal")
    public ResponseEntity<?> getActivate_journal() {
        return ResponseEntity.ok(activity_journalService.getAll());
    }

    @PostMapping("/api/activityJournal")
    public ResponseEntity<?> saveActivate_journal(@RequestBody Activity_journal activity_journal) {
        return ResponseEntity.ok(activity_journalService.create(activity_journal));
    }

    @PutMapping("/api/activityJournal")
    public ResponseEntity<?> updateActivate_journal(@RequestBody Activity_journal activity_journal) {
        return ResponseEntity.ok(activity_journalService.create(activity_journal));
    }

    @DeleteMapping("/api/activityJournal/{id}")
    public void deleteActivate_journal(@PathVariable Long id) {
        activity_journalService.delete(id);
    }

}

