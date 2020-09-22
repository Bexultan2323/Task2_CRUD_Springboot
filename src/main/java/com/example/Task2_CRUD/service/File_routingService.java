package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Company;
import com.example.Task2_CRUD.model.File_routing;
import com.example.Task2_CRUD.repository.CompanyRepository;
import com.example.Task2_CRUD.repository.File_routingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class File_routingService {

    public final File_routingRepository file_routingRepository;


    public File_routingService(File_routingRepository file_routingRepository) {
        this.file_routingRepository = file_routingRepository;
    }

    public List<File_routing> getAll(){
        return file_routingRepository.findAll();
    }
    public File_routing getById(Long id){
        return file_routingRepository.findById(id).orElse(null);
    }

    public File_routing create(File_routing file_routing){
        return file_routingRepository.save(file_routing);
    }
    public File_routing update(File_routing file_routing){
        return file_routingRepository.save(file_routing);
    }
    public void delete(Long id){
        file_routingRepository.deleteById(id);
    }
}
