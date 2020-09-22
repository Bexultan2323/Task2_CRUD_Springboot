package com.example.Task2_CRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "History_request")
public class History_request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long requestId;
    private String status;
    private long createdTimestamp;
    private long createdBy;
    private long updatedTimestamp;
    private long updatedBy;

}
