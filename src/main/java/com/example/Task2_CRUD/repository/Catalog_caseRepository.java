package com.example.Task2_CRUD.repository;

import com.example.Task2_CRUD.model.Act;
import com.example.Task2_CRUD.model.Catalog_case;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Catalog_caseRepository extends CrudRepository<Catalog_case, Long> {
    List<Catalog_case> findAll();
}
