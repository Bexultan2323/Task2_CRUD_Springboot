package com.example.Task2_CRUD.repository;

import com.example.Task2_CRUD.model.Act;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActRepository extends CrudRepository<Act, Long> {
    List<Act> findAll();
}
