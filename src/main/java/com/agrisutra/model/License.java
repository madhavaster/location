package com.agrisutra.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Table(name = "license")
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String manfDealerName;
    private String houseNo;
    private String streetNm;
    private String surveyNo;
    @ManyToOne
    @JoinColumn(name = "village_fk")
    private Village village;
    private String pinCode;
    private Character isGoDown;
    private String licType;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service serviceId;
    private String newLicNo;
    private String oldLicNo;
    private String lastRenewedDt;
    private String licExpireDt;
    private String licIssueDt;
    private String isActive;
}