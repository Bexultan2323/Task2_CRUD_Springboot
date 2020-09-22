package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Record;
import com.example.Task2_CRUD.model.Request;
import com.example.Task2_CRUD.repository.RecordRepository;
import com.example.Task2_CRUD.repository.RequestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {

    public final RequestRepository requestRepository;

    public RequestService( RequestRepository requestRepository){
        this.requestRepository=requestRepository;
    }

    public List<Request> getAll(){
        return requestRepository.findAll();
    }


    public Request getById(long id){
        return requestRepository.findById(id).orElse(null);
    }


    public Request create(Request request){
        return requestRepository.save(request);
    }


    public Request update(Request request){
        return requestRepository.save(request);
    }

    public void delete(Long id){
        requestRepository.deleteById(id);
    }
}
