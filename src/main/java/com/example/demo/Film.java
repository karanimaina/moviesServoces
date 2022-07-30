package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table
public class Film {
    @Id
    private int id;
    private int Language_id;
    private String title;
    private String description;
    private int release_year;
    private int rental_duration;
    private int length;
    private int replacement_cost;
    private int rating;
    private Timestamp last_update;
    private String special_features;
    private String full_text;
}
