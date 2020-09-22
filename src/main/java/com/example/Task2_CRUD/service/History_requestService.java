package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.History_request;
import com.example.Task2_CRUD.repository.History_requestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class History_requestService {

    public final History_requestRepository history_requestRepositoryRepository;

    public History_requestService(History_requestRepository history_requestRepositoryRepository){
        this.history_requestRepositoryRepository=history_requestRepositoryRepository;
    }

    public List<History_request> getAll(){
        return history_requestRepositoryRepository.findAll();
    }


    public History_request getById(long id){
        return history_requestRepositoryRepository.findById(id).orElse(null);
    }


    public History_request create(History_request history){
        return history_requestRepositoryRepository.save(history);
    }


    public History_request update(History_request history){
        return history_requestRepositoryRepository.save(history);
    }

    public void delete(Long id){
        history_requestRepositoryRepository.deleteById(id);
    }
}

