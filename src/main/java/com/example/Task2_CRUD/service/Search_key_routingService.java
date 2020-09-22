package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Request;
import com.example.Task2_CRUD.model.Search_key_routing;
import com.example.Task2_CRUD.repository.RequestRepository;
import com.example.Task2_CRUD.repository.Search_key_routingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Search_key_routingService {

    public final Search_key_routingRepository search_key_routingRepository;

    public Search_key_routingService( Search_key_routingRepository search_key_routingRepository){
        this.search_key_routingRepository=search_key_routingRepository;
    }

    public List<Search_key_routing> getAll(){
        return search_key_routingRepository.findAll();
    }


    public Search_key_routing getById(long id){
        return search_key_routingRepository.findById(id).orElse(null);
    }


    public Search_key_routing create(Search_key_routing search_key_routing){
        return search_key_routingRepository.save(search_key_routing);
    }


    public Search_key_routing update(Search_key_routing search_key_routing){
        return search_key_routingRepository.save(search_key_routing);
    }

    public void delete(Long id){
        search_key_routingRepository.deleteById(id);
    }
}
