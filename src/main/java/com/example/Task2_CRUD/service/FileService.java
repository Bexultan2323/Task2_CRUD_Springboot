package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Act;
import com.example.Task2_CRUD.model.File;
import com.example.Task2_CRUD.repository.ActRepository;
import com.example.Task2_CRUD.repository.FileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileService {

    public final FileRepository fileRepository;

    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }


    public List<File> getAll(){
        return fileRepository.findAll();
    }
    public File getById(Long id){
        return fileRepository.findById(id).orElse(null);
    }

    public File create(File file){
        return fileRepository.save(file);
    }
    public File update(File file){
        return fileRepository.save(file);
    }
    public void delete(Long id){
        fileRepository.deleteById(id);
    }
}

