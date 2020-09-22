package com.example.Task2_CRUD.repository;

import com.example.Task2_CRUD.model.Act;
import com.example.Task2_CRUD.model.Share;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShareRepository extends CrudRepository<Share, Long> {
    List<Share> findAll();
}
