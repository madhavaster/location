package com.agrisutra.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "mandal")
public class Mandal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer code;
    private String name;
    private String active;
    private String sanCode;
    private Integer goiCode;
    private String fertDistCd;
    private String fertBlockCd;
    @ManyToOne
    @JoinColumn(name="subdivision_fk")
    private SubDivision subDivision;//HAS-A
}
