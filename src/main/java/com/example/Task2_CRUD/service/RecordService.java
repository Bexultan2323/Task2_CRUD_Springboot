package com.example.Task2_CRUD.service;

import com.example.Task2_CRUD.model.Fond;
import com.example.Task2_CRUD.model.Record;
import com.example.Task2_CRUD.repository.FondRepository;
import com.example.Task2_CRUD.repository.RecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    public final RecordRepository recordRepository;

    public RecordService( RecordRepository recordRepository){
        this.recordRepository=recordRepository;
    }

    public List<Record> getAll(){
        return recordRepository.findAll();
    }


    public Record getById(long id){
        return recordRepository.findById(id).orElse(null);
    }


    public Record create(Record record){
        return recordRepository.save(record);
    }


    public Record update(Record record){
        return recordRepository.save(record);
    }

    public void delete(Long id){
        recordRepository.deleteById(id);
    }
}

