package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Activity_journal;
import com.example.Task2_CRUD.repository.Activity_journalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Activity_journalService {

    public final Activity_journalRepository activity_journalRepository;


    public Activity_journalService(Activity_journalRepository activity_journalRepository) {
        this.activity_journalRepository = activity_journalRepository;
    }

    public List<Activity_journal> getAll(){
        return activity_journalRepository.findAll();
    }
    public Activity_journal getById(Long id){
        return activity_journalRepository.findById(id).orElse(null);
    }

    public Activity_journal create(Activity_journal activity_journal){
        return activity_journalRepository.save(activity_journal);
    }
    public Activity_journal update(Activity_journal activity_journal){
        return activity_journalRepository.save(activity_journal);
    }
    public void delete(Long id){
        activity_journalRepository.deleteById(id);
    }
}
