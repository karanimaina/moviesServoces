package com.example.demo.model;

import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Table
@Entity
@RequiredArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String country;
    private Timestamp lastUpdate;

}
