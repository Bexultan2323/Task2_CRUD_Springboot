package com.example.Task2_CRUD.repository;

import com.example.Task2_CRUD.model.File_routing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface File_routingRepository  extends CrudRepository<File_routing,Long> {
    List<File_routing> findAll();
}
