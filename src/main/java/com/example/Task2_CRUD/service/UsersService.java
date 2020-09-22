package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Temfiles;
import com.example.Task2_CRUD.model.Users;
import com.example.Task2_CRUD.repository.TemfilesRepository;
import com.example.Task2_CRUD.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    public final UsersRepository usersRepository;

    public UsersService( UsersRepository usersRepository){
        this.usersRepository=usersRepository;
    }

    public List<Users> getAll(){
        return usersRepository.findAll();
    }


    public Users getById(long id){
        return usersRepository.findById(id).orElse(null);
    }


    public Users create(Users users){
        return usersRepository.save(users);
    }


    public Users update(Users users){
        return usersRepository.save(users);
    }

    public void delete(Long id){
        usersRepository.deleteById(id);
    }
}
