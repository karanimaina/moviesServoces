package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table
@Getter
@Setter
@RequiredArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Language language;
    private String title;
    private String description;
    private int release_year;
    private int rental_duration;
    private int length;
    private int replacement_cost;
    private int rating;
    @CreationTimestamp
    private Timestamp lastUpdate;
    private String special_features;
    private String full_text;

}
