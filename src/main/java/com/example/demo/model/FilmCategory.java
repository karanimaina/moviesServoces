package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Getter @Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Table
public class FilmCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int filmId;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Category category;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Film film;
    private Timestamp last_update;
}
