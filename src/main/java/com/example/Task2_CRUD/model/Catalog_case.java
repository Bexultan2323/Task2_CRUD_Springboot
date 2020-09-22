package com.example.Task2_CRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Catalog_case")
public class Catalog_case{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long caseId;
    private long catologId;
    private long companyUnitId;
    private long createdTimestamp;
    private long createdBy;
    private long updatedTimestamp;
    private long updatedBy;
}
