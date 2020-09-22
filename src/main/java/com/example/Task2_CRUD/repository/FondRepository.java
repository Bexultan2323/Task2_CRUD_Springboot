package com.example.Task2_CRUD.repository;

import com.example.Task2_CRUD.model.Fond;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FondRepository extends CrudRepository<Fond,Long> {
    List<Fond> findAll();
}
