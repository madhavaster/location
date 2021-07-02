package com.agrisutra.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer code;
    private String name;
    private Character   status;
}
