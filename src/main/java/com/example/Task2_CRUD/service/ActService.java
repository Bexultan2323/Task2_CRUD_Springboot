package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Act;
import com.example.Task2_CRUD.model.Activity_journal;
import com.example.Task2_CRUD.repository.ActRepository;
import com.example.Task2_CRUD.repository.Activity_journalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActService {

    public final ActRepository actRepository;

    public ActService(ActRepository actRepository) {
        this.actRepository = actRepository;
    }


    public List<Act> getAll(){
        return actRepository.findAll();
    }
    public Act getById(Long id){
        return actRepository.findById(id).orElse(null);
    }

    public Act create(Act act){
        return actRepository.save(act);
    }
    public Act update(Act act){
        return actRepository.save(act);
    }
    public void delete(Long id){
        actRepository.deleteById(id);
    }
}
