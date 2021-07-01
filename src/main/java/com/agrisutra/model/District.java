package com.agrisutra.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "district")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer code;
    private String name;
    private String status;
    private String sanCode;
    private Integer goiCode;
    private String fertCode;
    //integration
    @ManyToOne
    @JoinColumn(name="region_fk")
    private Region region;//HAS-A
    @ManyToOne
    @JoinColumn(name="state_fk")
    private State state;//HAS-A
}
