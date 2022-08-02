package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Table
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator ="country_id")
    private int id;
    private String country;
    private Timestamp lastUpdate;

}
