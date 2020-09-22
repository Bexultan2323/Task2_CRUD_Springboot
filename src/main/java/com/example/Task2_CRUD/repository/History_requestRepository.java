package com.example.Task2_CRUD.repository;

import com.example.Task2_CRUD.model.History_request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface History_requestRepository extends CrudRepository<History_request, Long> {
    List<History_request> findAll();
}
