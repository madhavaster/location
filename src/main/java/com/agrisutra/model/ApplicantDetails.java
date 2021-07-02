package com.agrisutra.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "applicant_details")
public class ApplicantDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "license_fk")
    private License license;
    private String name;
    private String houseNo;
    private String steetName;
    @ManyToOne
    @JoinColumn(name = "village_fk")
    private Village village;
    private String pinNo;
    private String mobileNo;
    private String contactNo;
    private String emailId;
    private String tinNo;
    private String panNo;
    private String capacity;
    private Character active;
    private String aadhaarNo;
    private String gstRegNo;
    private String altNo;
    private String fatherName;
}