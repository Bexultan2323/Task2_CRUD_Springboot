package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Request;
import com.example.Task2_CRUD.model.Search_key;
import com.example.Task2_CRUD.repository.RequestRepository;
import com.example.Task2_CRUD.repository.Search_keyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Search_keyService {

    public final Search_keyRepository search_keyRepository;

    public Search_keyService( Search_keyRepository search_keyRepository){
        this.search_keyRepository=search_keyRepository;
    }

    public List<Search_key> getAll(){
        return search_keyRepository.findAll();
    }


    public Search_key getById(long id){
        return search_keyRepository.findById(id).orElse(null);
    }


    public Search_key create(Search_key search_key){
        return search_keyRepository.save(search_key);
    }


    public Search_key update(Search_key search_key){
        return search_keyRepository.save(search_key);
    }

    public void delete(Long id){
        search_keyRepository.deleteById(id);
    }
}
