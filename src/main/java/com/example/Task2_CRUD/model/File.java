package com.example.Task2_CRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "File")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String type;
    private String size;
    private long pageCount;
    private String hash;
    private boolean isDeleted;
    private long fileBinaryId;
    private long createdTimestamp;
    private long createdBy;
    private long updatedTimestamp;
    private long updatedBy;
}
