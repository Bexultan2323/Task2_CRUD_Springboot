package com.example.Task2_CRUD.repository;

import com.example.Task2_CRUD.model.Activity_journal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Activity_journalRepository extends CrudRepository<Activity_journal, Long> {
    List<Activity_journal> findAll();
}