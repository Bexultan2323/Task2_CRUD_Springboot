package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Location;
import com.example.Task2_CRUD.model.Nomenclature_summary;
import com.example.Task2_CRUD.repository.Nomenclature_summaryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Nomenclature_summaryService {

    public final Nomenclature_summaryRepository nomenclature_summaryRepository;

    public  Nomenclature_summaryService(Nomenclature_summaryRepository nomenclature_summaryRepository){
        this.nomenclature_summaryRepository=nomenclature_summaryRepository;
    }

    public List<Nomenclature_summary> getAll(){
        return nomenclature_summaryRepository.findAll();
    }


    public Nomenclature_summary getById(Long id){
        return nomenclature_summaryRepository.findById(id).orElse(null);
    }


    public Nomenclature_summary create(Nomenclature_summary nomenclature_summary){
        return nomenclature_summaryRepository.save(nomenclature_summary);
    }


    public Nomenclature_summary update(Nomenclature_summary nomenclature_summary){
        return nomenclature_summaryRepository.save(nomenclature_summary);
    }

    public void delete(Long id){
        nomenclature_summaryRepository.deleteById(id);
    }



}
