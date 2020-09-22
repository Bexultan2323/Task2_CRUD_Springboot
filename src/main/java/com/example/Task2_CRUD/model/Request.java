package com.example.Task2_CRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long requestUserId;
    private long responseUserId;
    private long caseId;
    private long caseIndexId;
    private String createdType;
    private String comment;
    private String status;
    private long timestamp;
    private long sharestamp;
    private long sharefinish;
    private boolean favorite;
    private long updated_timestamp;
    private long updated_by;
    private String declinenote;
    private long companyUnitId;
    private long fromRequestId;


}
