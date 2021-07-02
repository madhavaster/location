package com.agrisutra.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Integer serviceId;
    @Column(name = "service_name")
    private String serviceName;
    @ElementCollection
    @CollectionTable(name = "application_types", joinColumns = @JoinColumn(name = "service_id"))
    @Column(name = "application_type")
    private Set<String> applicationType;
}
