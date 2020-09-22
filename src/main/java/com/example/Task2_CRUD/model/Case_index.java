package com.example.Task2_CRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Case_index")
public class Case_index {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String caseIndex;
    private String titleRu;
    private String titleKz;
    private String titleEn;
    private long storageType;
    private long storageYear;
    private String note;
    private long companyUnitId;
    private long nomenclatureId;
    private long createdTimestamp;
    private long createdBy;
    private long updatedTimestamp;
    private long updatedBy;

}
