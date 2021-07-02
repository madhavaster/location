package com.agrisutra.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Table(name = "app_tracker")
public class AppTracker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "appl_id_fk")
    private SeedDealerLicense applicationId;
    private String statusId;
    private String toEmplId;
    private String fromEmplId;
    private String insertDate;
    private String lastUpdatedBy;
    private String lastUpdatedDate;
    private String applFirstName;
    private String firmName;
    private String applType;
    @ManyToOne
    @JoinColumn(name = "appl_location_fk")
    private Village applLocation;
    private String status;
    private String remarks;
    private String licenseIssueDate;
    private String licenseValidDate;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service serviceId;
    @Column(name = "appl_num")
    private String applicationNumber;
    private String parentOrChild;
    private String parentAppNumber;
    private String paymentStatus;
    @ManyToOne
    @JoinColumn(name = "district_fk")
    private District district;
}
