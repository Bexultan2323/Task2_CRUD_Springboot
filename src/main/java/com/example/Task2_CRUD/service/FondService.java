package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Fond;
import com.example.Task2_CRUD.repository.FondRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FondService {

    public final FondRepository fondRepository;

    public FondService( FondRepository fondRepository){
        this.fondRepository=fondRepository;
    }

    public List<Fond> getAll(){
        return fondRepository.findAll();
    }


    public Fond getById(long id){
        return fondRepository.findById(id).orElse(null);
    }


    public Fond create(Fond student){
        return fondRepository.save(student);
    }


    public Fond update(Fond student){
        return fondRepository.save(student);
    }

    public void delete(Long id){
        fondRepository.deleteById(id);
    }
}
