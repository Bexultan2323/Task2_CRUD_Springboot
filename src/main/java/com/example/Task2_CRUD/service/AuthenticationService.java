package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Act;
import com.example.Task2_CRUD.model.Authentication;
import com.example.Task2_CRUD.repository.ActRepository;
import com.example.Task2_CRUD.repository.AuthenticationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthenticationService {

    public final AuthenticationRepository authenticationRepository;

    public AuthenticationService(AuthenticationRepository authenticationRepository) {
        this.authenticationRepository = authenticationRepository;
    }


    public List<Authentication> getAll(){
        return authenticationRepository.findAll();
    }
    public Authentication getById(Long id){
        return authenticationRepository.findById(id).orElse(null);
    }

    public Authentication create(Authentication authentication){
        return authenticationRepository.save(authentication);
    }
    public Authentication update(Authentication authentication){
        return authenticationRepository.save(authentication);
    }
    public void delete(Long id){
        authenticationRepository.deleteById(id);
    }
}
