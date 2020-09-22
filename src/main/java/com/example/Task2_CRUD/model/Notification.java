package com.example.Task2_CRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String objectiveType;
    private long objectId;
    private long companyUnitId;
    private long userId;
    private long createdTimestamp;
    private long viewedTimestamp;
    private boolean isViewed;
    private String title;
    private String text;
    private long companyId;
}