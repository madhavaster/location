package com.agrisutra.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Table(name = "seed_dealer_license")
public class SeedDealerLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appl_id")
    private Integer applicationId;
    @Column(name = "appl_num")
    private String applicationNumber;
    @Column(name = "appl_type")
    private String applicationType;
    @Column(name = "appl_date")
    private String applicationDate;
    private String firmName;
    private String firmCapacity;
    private String sanIssueDate;
    private String sanExpiryDate;
    private String sanOrderNo;
    private String parentAppId;
    private String oldAppId;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service serviceId;
    private String essenCommodities;
    private String applicantTinNo;
    private String applicantPanNo;
}