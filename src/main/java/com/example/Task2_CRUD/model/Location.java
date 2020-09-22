package com.example.Task2_CRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String row;
    private String line;
    private String columns;
    private String box;
    private long companyUnitId;
    private long createdTimestamp;
    private long createdBy;
    private long updatedTimestamp;
    private long updatedBy;

}
