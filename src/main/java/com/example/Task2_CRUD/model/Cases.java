package com.example.Task2_CRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Cases")
public class Cases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String caseNumber;
    private String numberOfTom;
    private String caseHeadingRu;
    private String caseHeadingKz;
    private String caseHeadingEn;
    private long startDate;
    private long endDate;
    private long nubmerPage;
    private boolean ESP;
    private String ESPSign;
    private boolean NAF;
    private boolean deleting;
    private boolean access;
    private String hash;
    private boolean versionActivation;
    private String note;
    private long idLocation;
    private long caseIndexId;
    private long idRecord;
    private long companyUnitId;
    private long actId;
    private String blockchain;
    private long dateAddBlockchain;
    private long createdTimestamp;
    private long createdBy;
    private long updatedTimestamp;
    private long updatedBy;
}
