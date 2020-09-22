package com.example.Task2_CRUD.repository;

import com.example.Task2_CRUD.model.Act;
import com.example.Task2_CRUD.model.Authentication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthenticationRepository extends CrudRepository<Authentication, Long> {
    List<Authentication> findAll();
}
