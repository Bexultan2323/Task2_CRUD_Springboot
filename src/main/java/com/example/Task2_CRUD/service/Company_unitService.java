package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Catalog;
import com.example.Task2_CRUD.model.Company_unit;
import com.example.Task2_CRUD.repository.CatalogRepository;
import com.example.Task2_CRUD.repository.Company_unitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Company_unitService {

    public final Company_unitRepository company_unitRepository;

    public Company_unitService(Company_unitRepository company_unitRepository) {
        this.company_unitRepository = company_unitRepository;
    }

    public List<Company_unit> getAll(){
        return company_unitRepository.findAll();
    }

    public Company_unit getById(Long id){
        return company_unitRepository.findById(id).orElse(null);
    }
    public Company_unit create(Company_unit company_unit){
        return company_unitRepository.save(company_unit);
    }
    public Company_unit update(Company_unit company_unit){
        return company_unitRepository.save(company_unit);
    }
    public void delete(Long id){
        company_unitRepository.deleteById(id);
    }

}
