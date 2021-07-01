package com.agrisutra.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "state")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "state_name")
    private String name;
    @Column(name = "active")
    private String isActive;
}