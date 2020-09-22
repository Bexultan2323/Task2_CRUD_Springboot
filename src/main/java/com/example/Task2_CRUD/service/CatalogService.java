package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Catalog;
import com.example.Task2_CRUD.model.Catalog_case;
import com.example.Task2_CRUD.repository.CatalogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    public final CatalogRepository catalogRepository;

    public CatalogService(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public List<Catalog> getAll(){
        return catalogRepository.findAll();
    }

    public Catalog getById(Long id){
        return catalogRepository.findById(id).orElse(null);
    }
    public Catalog create(Catalog catalog){
        return catalogRepository.save(catalog);
    }
    public Catalog update(Catalog catalog){
        return catalogRepository.save(catalog);
    }
    public void delete(Long id){
        catalogRepository.deleteById(id);
    }

}
