package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Share;
import com.example.Task2_CRUD.model.Temfiles;
import com.example.Task2_CRUD.repository.ShareRepository;
import com.example.Task2_CRUD.repository.TemfilesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemfilesService {

    public final TemfilesRepository temfilesRepository;

    public TemfilesService( TemfilesRepository temfilesRepository){
        this.temfilesRepository=temfilesRepository;
    }

    public List<Temfiles> getAll(){
        return temfilesRepository.findAll();
    }


    public Temfiles getById(long id){
        return temfilesRepository.findById(id).orElse(null);
    }


    public Temfiles create(Temfiles temfiles){
        return temfilesRepository.save(temfiles);
    }


    public Temfiles update(Temfiles temfiles){
        return temfilesRepository.save(temfiles);
    }

    public void delete(Long id){
        temfilesRepository.deleteById(id);
    }
}
