package com.example.Task2_CRUD.repository;

import com.example.Task2_CRUD.model.Act;
import com.example.Task2_CRUD.model.Search_key;
import com.example.Task2_CRUD.model.Search_key_routing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Search_key_routingRepository extends CrudRepository<Search_key_routing, Long> {
    List<Search_key_routing> findAll();
}
