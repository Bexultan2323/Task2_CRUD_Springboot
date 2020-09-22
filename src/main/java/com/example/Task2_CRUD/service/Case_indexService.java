package com.example.Task2_CRUD.service;


import com.example.Task2_CRUD.model.Case_index;
import com.example.Task2_CRUD.model.Fond;
import com.example.Task2_CRUD.repository.Case_indexRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Case_indexService {

    public final Case_indexRepository case_indexRepository;

    public Case_indexService(Case_indexRepository case_indexRepository) {
        this.case_indexRepository = case_indexRepository;
    }

    public List<Case_index> getAll(){
        return case_indexRepository.findAll();
    }


    public Case_index getById(long id){
        return case_indexRepository.findById(id).orElse(null);
    }


    public Case_index create(Case_index Case_index){
        return case_indexRepository.save(Case_index);
    }


    public Case_index update(Case_index case_index){
        return case_indexRepository.save(case_index);
    }

    public void delete(Long id){
        case_indexRepository.deleteById(id);
    }
}
