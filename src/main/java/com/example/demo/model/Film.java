package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Language language;
}
