package com.example.Task2_CRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Fond")
public class Fond {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fondNumber;

    private long createdTimestamp;

    private long createdBy;

    private long updatedTimestamp;

    private long updatedBy;

}