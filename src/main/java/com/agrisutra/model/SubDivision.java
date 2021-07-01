package com.agrisutra.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "subdivision")
public class SubDivision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer code;
    private String name;
    private Character active;
    @ManyToOne
    @JoinColumn(name="district_fk")
    private District district;//HAS-A
}