package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Cases;
import com.example.Task2_CRUD.repository.CasesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasesService {

    public final CasesRepository casesRepository;

    public CasesService(CasesRepository casesRepository) {
        this.casesRepository = casesRepository;
    }

    public List<Cases> getAll(){
        return casesRepository.findAll();
    }
    public  Cases getById(Long id){
        return casesRepository.findById(id).orElse(null);
    }

    public Cases create(Cases cases){
        return casesRepository.save(cases);
    }


    public Cases update(Cases cases){
        return casesRepository.save(cases);
    }
    public void delete(Long id){
        casesRepository.deleteById(id);
    }
}
