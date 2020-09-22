package com.example.Task2_CRUD.service;


import com.example.Task2_CRUD.model.Location;
import com.example.Task2_CRUD.model.Nomenclature;
import com.example.Task2_CRUD.repository.LocationRepository;
import com.example.Task2_CRUD.repository.NomenclatureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NomenclatureService {

    public final NomenclatureRepository nomenclatureRepository;

    public NomenclatureService( NomenclatureRepository nomenclatureRepository){
        this.nomenclatureRepository=nomenclatureRepository;
    }

    public List<Nomenclature> getAll(){
        return nomenclatureRepository.findAll();
    }


    public Nomenclature getById(long id){
        return nomenclatureRepository.findById(id).orElse(null);
    }


    public Nomenclature create(Nomenclature nomenclature){
        return nomenclatureRepository.save(nomenclature);
    }


    public Nomenclature update(Nomenclature nomenclature){
        return nomenclatureRepository.save(nomenclature);
    }

    public void delete(Long id){
        nomenclatureRepository.deleteById(id);
    }
}

