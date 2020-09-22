package com.example.Task2_CRUD.repository;

import com.example.Task2_CRUD.model.Act;
import com.example.Task2_CRUD.model.Nomenclature_summary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Nomenclature_summaryRepository extends CrudRepository<Nomenclature_summary, Long> {

    List<Nomenclature_summary> findAll();
}
