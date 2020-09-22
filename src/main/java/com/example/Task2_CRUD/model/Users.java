package com.example.Task2_CRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long authId;
    private String name;
    private String fullname;
    private String surname;
    private String secondname;
    private String status;
    private long companyUnitId;
    private String password;
    private long lastLoginTimestamp;
    private String Iin;
    private boolean isActive;
    private boolean isActiveted;
    private int companyId;
    private String codeIndex;
    private long createdTimestamp;
    private long createdBy;
    private long updatedTimestamp;
    private long updatedBy;

}

