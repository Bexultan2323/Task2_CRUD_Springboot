package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Catalog_case;
import com.example.Task2_CRUD.repository.Catalog_caseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Catalog_caseService {

    public final Catalog_caseRepository  catalog_caseRepository;

    public Catalog_caseService(Catalog_caseRepository catalog_caseRepository) {
        this.catalog_caseRepository = catalog_caseRepository;
    }

    public List<Catalog_case> getAll(){
        return catalog_caseRepository.findAll();
    }
    public Catalog_case getById(Long id){
        return catalog_caseRepository.findById(id).orElse(null);
    }

    public Catalog_case create(Catalog_case catalog_case){
        return catalog_caseRepository.save(catalog_case);
    }
    public Catalog_case update(Catalog_case catalog_case){
        return catalog_caseRepository.save(catalog_case);
    }
    public void delete(Long id){
        catalog_caseRepository.deleteById(id);
    }

}
