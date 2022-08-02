package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table
@Data
@NoArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "film_id")
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
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;
}
