package com.agrisutra.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "village")
public class Village {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer code;
    private String name;
    @JsonIgnore
    private String active;
    @JsonIgnore
    private Integer goiCode;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="mandal_fk")
    private Mandal mandal;//HAS-A
}
