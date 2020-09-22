package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Fond;
import com.example.Task2_CRUD.model.Share;
import com.example.Task2_CRUD.repository.FondRepository;
import com.example.Task2_CRUD.repository.ShareRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShareService {

    public final ShareRepository shareRepository;

    public ShareService( ShareRepository shareRepository){
        this.shareRepository=shareRepository;
    }

    public List<Share> getAll(){
        return shareRepository.findAll();
    }


    public Share getById(long id){
        return shareRepository.findById(id).orElse(null);
    }


    public Share create(Share share){
        return shareRepository.save(share);
    }


    public Share update(Share share){
        return shareRepository.save(share);
    }

    public void delete(Long id){
        shareRepository.deleteById(id);
    }
}
