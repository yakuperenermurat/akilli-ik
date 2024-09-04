package com.akilli.ik.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "iller")
public class Il {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String ilAdi;

}
